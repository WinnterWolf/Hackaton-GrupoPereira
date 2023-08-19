package innovatexselfcheckout.model.mapper;

import innovatexselfcheckout.model.Customer;
import innovatexselfcheckout.repository.entity.CustomerEntity;

public class CustomerMapper {


    public Customer toCustomer(CustomerEntity customerEntity) {
        if ( customerEntity == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.cpf = customerEntity.getCpf();
        customer.name = customerEntity.getName();

        return customer;
    }


    public CustomerEntity toCustomerEntity(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setCpf( customer.cpf );
        customerEntity.setName( customer.name );

        return customerEntity;
    }
}
