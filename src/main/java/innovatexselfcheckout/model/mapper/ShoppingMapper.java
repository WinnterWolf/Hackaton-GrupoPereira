package innovatexselfcheckout.model.mapper;

import innovatexselfcheckout.model.Shopping;
import innovatexselfcheckout.repository.entity.ProductEntity;
import innovatexselfcheckout.repository.entity.ShoppingEntity;

import java.util.stream.Collectors;

public class ShoppingMapper {
    public static ShoppingEntity toShoppingEntity(Shopping shopping){
        ShoppingEntity shoppingEntity = new ShoppingEntity();



        shoppingEntity.setProducts(shopping.products.stream().map(it -> ProductMapper.toProductEntity(it)).collect(Collectors.toList()));
}
}
