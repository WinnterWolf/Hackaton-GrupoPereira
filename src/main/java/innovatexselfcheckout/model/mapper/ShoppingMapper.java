package innovatexselfcheckout.model.mapper;

import innovatexselfcheckout.model.Shopping;
import innovatexselfcheckout.repository.entity.ShoppingEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface ShoppingMapper {

    @Mapping(target = "datUpdate", ignore = true)
    @Mapping(target = "datCreation", ignore = true)
    ShoppingEntity toEntity(Shopping shopping);

    Shopping toShopping(ShoppingEntity entity);

    Shopping toShopping(Optional<ShoppingEntity> entity);
}
