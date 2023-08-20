package innovatexselfcheckout.model.mapper;

import innovatexselfcheckout.model.Shopping;
import innovatexselfcheckout.repository.entity.ShoppingEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ShoppingMapper {
    ShoppingEntity toEntity(Shopping shopping);
    Shopping toShopping(ShoppingEntity entity);
}
