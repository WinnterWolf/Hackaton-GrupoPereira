package innovatexselfcheckout.controller;

import innovatexselfcheckout.model.Pedido;
import innovatexselfcheckout.model.Shopping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "v1/shopping")
public class ShoppingController {

    ShoppingService shoppingService;

    @PostMapping
    public ResponseEntity AdicionarCompra(@RequestBody Shopping shopping){
        shoppingService.adicionarCompar(shopping);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/verificar")
    public ResponseEntity ValidarCompra(@RequestBody Pedido){
        shoppingService.validarCompra(pedido);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
