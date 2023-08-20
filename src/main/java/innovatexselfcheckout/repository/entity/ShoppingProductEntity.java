package innovatexselfcheckout.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GenerationType;
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

    @Column
    private BigInteger productId;

    @Column
    private BigInteger shoppingId;

    @ManyToOne
    @JoinColumn(name = "productId",insertable=false, updatable=false)
    private ProductEntity product;

    @ManyToOne
    @JoinColumn(name = "shoppingId", insertable=false, updatable=false )
    private ShoppingEntity shopping;

    public ShoppingProductEntity(BigInteger productId, BigInteger shoppingId) {
        this.productId = productId;
        this.shoppingId = shoppingId;
    }
}
