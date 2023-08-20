package innovatexselfcheckout.repository.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@Entity
@Table(name = "SHOPPING_PRODUCT")
@NoArgsConstructor
public class ShoppingProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    private BigInteger productId;
    private BigInteger shoppingId;

    public ShoppingProductEntity(BigInteger productId, BigInteger shoppingId) {
        this.productId = productId;
        this.shoppingId = shoppingId;
    }
}
