package innovatexselfcheckout.service;

import innovatexselfcheckout.model.Customer;
import innovatexselfcheckout.model.mapper.CustomerMapper;
import innovatexselfcheckout.repository.CustomerRepository;
import innovatexselfcheckout.repository.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

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
        customerRepository.save(mapper.customerToEntity(customer));
        return true;
    }

    @Override
    public Boolean deleteCustomer(String cpf) {

        final CustomerEntity customer = customerRepository.getById(cpf);
        if (Objects.isNull(customer)){
            return false;
        }
        customerRepository.delete(customer);
        return true;

    }

    @Override
    public Customer getCustomerByCpf(String cpf){

        final Customer customer = mapper.entityToCustomer(customerRepository.getById(cpf));
        return customer;
    }

    private BigInteger validateCpf(String cpf){

        return null;
    }
}
