package innovatexselfcheckout.service;

import innovatexselfcheckout.model.Pedido;
import innovatexselfcheckout.model.Shopping;
import innovatexselfcheckout.model.mapper.ShoppingMapper;
import innovatexselfcheckout.repository.CustomerRepository;
import innovatexselfcheckout.repository.ShoppingProductRepository;
import innovatexselfcheckout.repository.entity.ShoppingProductEntity;
import innovatexselfcheckout.repository.entity.ShoppingRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ShoppingService implements IShoppingService{

    @Autowired
    ShoppingRepository shoppingRepository;
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    ShoppingProductRepository shoppingProductRepository;


    @Override
    @Transactional
    public boolean adicionarCompra(Shopping shopping) {
        if(customerRepository.findById(shopping.cpf).isEmpty()){



            return false;
        }

        var shoppingEntity = shoppingRepository.save(ShoppingMapper.toShoppingEntity(shopping));

        var produto = shopping.getProducts()
                .stream()
                .map(it -> new ShoppingProductEntity(
                        it.getBarCode(),
                        shoppingEntity.getId()
                ))
                .toList();

        shoppingProductRepository.saveAll(produto);
        return true;
    }

    @Override
    public boolean validarCompra(Pedido pedido) {
        return false;
    }
}
