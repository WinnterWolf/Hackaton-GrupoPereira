package innovatexselfcheckout.service;

import innovatexselfcheckout.model.Customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> getAllCustomers();
    Boolean addCustomer(Customer customer);

    Boolean deleteCustomer(String cpf);

    Customer getCustomerByCpf(String cpf);
}
