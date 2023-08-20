package innovatexselfcheckout.model.mapper;

import innovatexselfcheckout.model.Product;
import innovatexselfcheckout.model.Shopping;
import innovatexselfcheckout.repository.entity.ProductEntity;
import innovatexselfcheckout.repository.entity.ShoppingEntity;
import innovatexselfcheckout.repository.entity.ShoppingProductEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-20T15:12:48-0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class ShoppingMapperImpl implements ShoppingMapper {

    @Override
    public ShoppingEntity toEntity(Shopping shopping) {
        if ( shopping == null ) {
            return null;
        }

        ShoppingEntity shoppingEntity = new ShoppingEntity();

        shoppingEntity.setProducts( productListToShoppingProductEntityList( shopping.getProducts() ) );

        return shoppingEntity;
    }

    @Override
    public Shopping toShopping(ShoppingEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Shopping shopping = new Shopping();

        shopping.setProducts( shoppingProductEntityListToProductList( entity.getProducts() ) );

        return shopping;
    }

    @Override
    public Shopping toShopping(Optional<ShoppingEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        Shopping shopping = new Shopping();

        return shopping;
    }

    protected ProductEntity productToProductEntity(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setBarCode( product.getBarCode() );
        productEntity.setName( product.getName() );
        productEntity.setPeso( product.getPeso() );

        return productEntity;
    }

    protected ShoppingProductEntity productToShoppingProductEntity(Product product) {
        if ( product == null ) {
            return null;
        }

        ShoppingProductEntity shoppingProductEntity = new ShoppingProductEntity();

        shoppingProductEntity.setProduct( productToProductEntity( product ) );

        return shoppingProductEntity;
    }

    protected List<ShoppingProductEntity> productListToShoppingProductEntityList(List<Product> list) {
        if ( list == null ) {
            return null;
        }

        List<ShoppingProductEntity> list1 = new ArrayList<ShoppingProductEntity>( list.size() );
        for ( Product product : list ) {
            list1.add( productToShoppingProductEntity( product ) );
        }

        return list1;
    }

    protected Product shoppingProductEntityToProduct(ShoppingProductEntity shoppingProductEntity) {
        if ( shoppingProductEntity == null ) {
            return null;
        }

        Product product = new Product();

        return product;
    }

    protected List<Product> shoppingProductEntityListToProductList(List<ShoppingProductEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<Product> list1 = new ArrayList<Product>( list.size() );
        for ( ShoppingProductEntity shoppingProductEntity : list ) {
            list1.add( shoppingProductEntityToProduct( shoppingProductEntity ) );
        }

        return list1;
    }
}
