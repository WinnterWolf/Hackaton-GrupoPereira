package innovatexselfcheckout.model;

import lombok.Data;

import java.util.List;

@Data
public class Shopping {
    public List<Product> products;

    public Double price;

    public String cpf;
}
