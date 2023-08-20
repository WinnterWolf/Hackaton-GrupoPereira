package innovatexselfcheckout.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigInteger;
import java.util.List;

@Data
@Entity
@Table(name = "PRODUCT")
public class ProductEntity {

    @Id
    @Column(name = "BAR_CODE", nullable = false)
    private BigInteger barCode;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private Double price;

    @Column
    private Double peso;

    @OneToMany(mappedBy = "product")
    private List<ShoppingProductEntity> shoppingProduct;
}
