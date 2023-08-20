package innovatexselfcheckout.service;

import innovatexselfcheckout.model.Pedido;
import innovatexselfcheckout.model.Shopping;

public interface IShoppingService {

    boolean adicionarCompra(Shopping shopping);
    boolean validarCompra(Pedido pedido);
}
