package innovatexselfcheckout.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
