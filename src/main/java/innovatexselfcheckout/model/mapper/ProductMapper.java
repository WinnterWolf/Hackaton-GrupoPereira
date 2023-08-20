package innovatexselfcheckout.model.mapper;

import innovatexselfcheckout.model.Product;
import innovatexselfcheckout.repository.entity.ProductEntity;

public class ProductMapper {

    public static ProductEntity toProductEntity(Product product){
        var productEntity = new ProductEntity();

        productEntity.setName(product.getName());
        productEntity.setCategory(product.getCategoria());
        productEntity.setPrice(product.getPreco());
        productEntity.setPeso(product.getPeso());
        return  productEntity;
    }

}
