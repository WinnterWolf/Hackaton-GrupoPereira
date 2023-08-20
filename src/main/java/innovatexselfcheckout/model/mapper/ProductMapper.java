package innovatexselfcheckout.model.mapper;

import innovatexselfcheckout.model.Product;
import innovatexselfcheckout.repository.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductEntity toEntity(Product product);

    Product toProduct(ProductEntity entity);
}
