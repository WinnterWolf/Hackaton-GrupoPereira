package innovatexselfcheckout.service;

import innovatexselfcheckout.exceptions.CustomerNotFoundException;
import innovatexselfcheckout.exceptions.InvalidCpfException;
import innovatexselfcheckout.model.Customer;
import innovatexselfcheckout.model.mapper.CustomerMapper;
import innovatexselfcheckout.repository.CustomerRepository;
import innovatexselfcheckout.repository.entity.CustomerEntity;
import innovatexselfcheckout.utils.ValidateCpf;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService  implements ICustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerMapper mapper;


    @Override
    public List<Customer> obterTodosCostumer() {
        final List<CustomerEntity> customers = customerRepository.findAll();

        return customers.stream().map(customer -> mapper.entityToCustomer(customer)).toList();

    }

    @Override
    public Boolean addCustomer(Customer customer) {
        if(validateCpf(customer.getCpf())){
            customerRepository.save(mapper.customerToEntity(customer));
            return true;
        }
        throw new InvalidCpfException();

    }

    @Override
    public Boolean deleteCustomer(String cpf) {

        try {
            final CustomerEntity customer = customerRepository.getById(cpf);
            customerRepository.delete(customer);
            return true;
        } catch (EntityNotFoundException ex){
            throw new CustomerNotFoundException();
        }

    }

    @Override
    public Customer getCustomerByCpf(String cpf){

        try {
            return mapper.entityToCustomer(customerRepository.getById(cpf));
        } catch (EntityNotFoundException ex){
            throw new CustomerNotFoundException();
        }
    }

    private Boolean validateCpf(String cpf){
        return ValidateCpf.isCPF(cpf);
    }
}
