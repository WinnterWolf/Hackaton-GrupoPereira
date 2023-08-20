package innovatexselfcheckout.model.mapper;

import innovatexselfcheckout.model.Customer;
import innovatexselfcheckout.repository.entity.CustomerEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-20T15:12:48-0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer entityToCustomer(CustomerEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setCpf( entity.getCpf() );
        customer.setName( entity.getName() );

        return customer;
    }

    @Override
    public CustomerEntity customerToEntity(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setCpf( customer.getCpf() );
        customerEntity.setName( customer.getName() );

        return customerEntity;
    }
}
