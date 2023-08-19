package innovatexselfcheckout.service;

import innovatexselfcheckout.model.Customer;
import innovatexselfcheckout.model.mapper.CustomerMapper;
import innovatexselfcheckout.repository.CustomerRepository;

import java.math.BigInteger;
import java.util.List;

public class CustomerService  implements ICustomerService{

    private CustomerRepository customerRepository;

    private CustomerMapper mapper;

    @Override
    public List<Customer> obterTodosCostumer() {
//        return customerRepository.findAll();
        return null;
    }

    @Override
    public Boolean addCustomer(Customer customer) {
        return null;
    }

    @Override
    public Boolean deleteCustomer(String cpf) {
        return null;
    }

    @Override
    public Customer getCustomerByCpf(String cpf){

        final Customer customer = mapper.toCustomer(customerRepository.getById(cpf));
        return null;
    }

    private BigInteger validateCpf(String cpf){

        return null;
    }
}
