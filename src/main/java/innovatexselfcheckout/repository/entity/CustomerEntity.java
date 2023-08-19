package innovatexselfcheckout.repository.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.List;

@Data
@Entity
@Table(name = "CUSTOMER")
public class CustomerEntity {

    @Id
    @Column(name = "CPF")
    private BigInteger cpf;

    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "CUSTOMER")
    private List<ShoppingEntity> shoppings;

}
