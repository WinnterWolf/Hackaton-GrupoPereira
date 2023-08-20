package innovatexselfcheckout.service;

import innovatexselfcheckout.model.Customer;
import innovatexselfcheckout.model.mapper.CustomerMapper;
import innovatexselfcheckout.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class CustomerService  implements ICustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerMapper mapper;


    @Override
    public List<Customer> obterTodosCostumer() {
//        return customerRepository.findAll();
        return null;
    }

    @Override
    public Boolean addCustomer(Customer customer) {
        customerRepository.save(mapper.customerToEntity(customer));
        return true;
    }

    @Override
    public Boolean deleteCustomer(String cpf) {
        return null;
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
