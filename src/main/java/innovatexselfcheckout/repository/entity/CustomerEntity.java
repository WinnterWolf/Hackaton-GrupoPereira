package innovatexselfcheckout.repository.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigInteger;
import java.time.Instant;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "CUSTOMER")
public class CustomerEntity {

    @Id
    @Column(name = "CPF")
    private String cpf;

    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "customer")
    private List<ShoppingEntity> shopping;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Instant datCreation;

    @Column
    @UpdateTimestamp
    private Instant datUpdate;

}
