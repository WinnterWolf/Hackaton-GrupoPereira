package innovatexselfcheckout.repository.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigInteger;

@Table(name = "PRODUCT")
public class ProductEntity {

    @Id
    private BigInteger barCode;
    private String name;
    private String category;

    private Double price;
}
