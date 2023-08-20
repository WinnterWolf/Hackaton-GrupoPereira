package innovatexselfcheckout.model.mapper;

import innovatexselfcheckout.model.Customer;
import innovatexselfcheckout.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer entityToCustomer(CustomerEntity entity);
    CustomerEntity customerToEntity(Customer customer);
}
