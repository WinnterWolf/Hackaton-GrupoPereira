package innovatexselfcheckout.model.mapper;

import innovatexselfcheckout.model.Customer;
import innovatexselfcheckout.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer entityToCustomer(CustomerEntity entity);

    @Mapping(target = "datUpdate", ignore = true)
    @Mapping(target = "datCreation", ignore = true)
    CustomerEntity customerToEntity(Customer customer);
}
