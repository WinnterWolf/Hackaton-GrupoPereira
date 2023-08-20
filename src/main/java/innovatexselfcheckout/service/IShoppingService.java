package innovatexselfcheckout.service;

import innovatexselfcheckout.model.Pedido;
import innovatexselfcheckout.model.Shopping;

import java.math.BigInteger;

public interface IShoppingService {

    boolean adicionarCompra(Shopping shopping);
    boolean validarCompra(Pedido pedido);

    Shopping obterCompraPorId(BigInteger id);
}
