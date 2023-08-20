package innovatexselfcheckout.service;

import innovatexselfcheckout.model.Product;

import java.util.List;

public interface IProductService {

    boolean adicionarProduto(Product produto);
    List<Product> obterTodos();

}
