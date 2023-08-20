package innovatexselfcheckout.model.mapper;

import innovatexselfcheckout.model.Product;
import innovatexselfcheckout.repository.entity.ProductEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-20T15:12:48-0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductEntity toEntity(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setPrice( product.getPreco() );
        productEntity.setCategory( product.getCategoria() );
        productEntity.setBarCode( product.getBarCode() );
        productEntity.setName( product.getName() );
        productEntity.setPeso( product.getPeso() );

        return productEntity;
    }

    @Override
    public Product toProduct(ProductEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Product product = new Product();

        product.setBarCode( entity.getBarCode() );
        product.setName( entity.getName() );
        product.setPeso( entity.getPeso() );

        return product;
    }
}
