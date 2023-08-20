package innovatexselfcheckout.model.mapper;

import innovatexselfcheckout.model.Shopping;
import innovatexselfcheckout.repository.entity.ProductEntity;
import innovatexselfcheckout.repository.entity.ShoppingEntity;

import java.util.stream.Collectors;

public class ShoppingMapper {
    public static ShoppingEntity toShoppingEntity(Shopping shopping) {
        ShoppingEntity shoppingEntity = new ShoppingEntity();

        shoppingEntity.setCpf(shopping.getCpf());

        return  shoppingEntity;
    }
}
