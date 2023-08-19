package innovatexselfcheckout.model.mapper;

import innovatexselfcheckout.model.Customer;
import innovatexselfcheckout.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer toCustomer(CustomerEntity customerEntity);
}
