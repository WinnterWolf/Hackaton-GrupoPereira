package innovatexselfcheckout.model.mapper;

import innovatexselfcheckout.model.Product;
import innovatexselfcheckout.repository.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(target = "price", source = "preco")
    @Mapping(target = "category", source = "categoria")
    ProductEntity toEntity(Product product);

    Product toProduct(ProductEntity entity);
}
