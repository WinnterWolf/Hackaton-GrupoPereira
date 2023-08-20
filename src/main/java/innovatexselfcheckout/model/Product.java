package innovatexselfcheckout.model;

import lombok.Data;

import java.math.BigInteger;

@Data
public class Product {

    private BigInteger barCode;
    private String name;
    private Double peso;
    private String categoria;
    private Double preco;
}
