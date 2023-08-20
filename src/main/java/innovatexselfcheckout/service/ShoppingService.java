package innovatexselfcheckout.service;

import innovatexselfcheckout.model.Pedido;
import innovatexselfcheckout.model.Shopping;
import innovatexselfcheckout.repository.CustomerRepository;
import innovatexselfcheckout.repository.entity.ShoppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingService implements IShoppingService{

    @Autowired
    ShoppingRepository shoppingRepository;
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public boolean adicionarCompra(Shopping shopping) {
        if(customerRepository.findById(shopping.cpf).isEmpty()){
            return false;
        }

        shoppingRepository.save()
    }

    @Override
    public boolean validarCompra(Pedido pedido) {
        return false;
    }
}
