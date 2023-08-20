package innovatexselfcheckout.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigInteger;
import java.util.List;

@Data
@Entity
@Table(name = "PRODUCT")
public class ProductEntity {

    @Id
    private BigInteger barCode;
    private String name;
    private String category;
    private Double price;
    private Double peso;

    @OneToMany(mappedBy = "product")
    private List<ShoppingProductEntity> shoppingProduct;
}
