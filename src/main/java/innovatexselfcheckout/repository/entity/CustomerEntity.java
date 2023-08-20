package innovatexselfcheckout.repository.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
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

}
