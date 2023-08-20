package innovatexselfcheckout.repository.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;

@Data
@Entity
@Table(name = "SHOPPING_PRODUCT")
public class ShoppingProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    private BigInteger productId;
    private BigInteger shoppingId;
}
