package innovatexselfcheckout.repository.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigInteger;
import java.time.Instant;
import java.util.List;

@Data
@Entity
@Table(name = "SHOPPING")
public class ShoppingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

//    private List<ProductEntity> products;

    private Boolean validated;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Instant datCreation;

//    @ManyToOne
//    @JoinColumn(name = "CPF")
//    private CustomerEntity customer;

}
