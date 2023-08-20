package innovatexselfcheckout.repository.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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

    @OneToMany(mappedBy = "shopping")
    private List<ShoppingProductEntity> products;

    private Boolean validated = false;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Instant datCreation;

    @Column
    @UpdateTimestamp
    private Instant datUpdate;

    @ManyToOne
    @JoinColumn(name = "cpf", insertable=false, updatable=false)
    private CustomerEntity customer;

}
