package innovatexselfcheckout.service;

import innovatexselfcheckout.model.Product;
import innovatexselfcheckout.model.mapper.ProductMapper;
import innovatexselfcheckout.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductMapper mapper;

    @Override
    public boolean adicionarProduto(Product produto) {
        productRepository.save(mapper.toEntity(produto));
        return true;
    }
}
