package innovatexselfcheckout.controller;

import innovatexselfcheckout.model.Pedido;
import innovatexselfcheckout.model.Shopping;
import innovatexselfcheckout.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.BigInteger;

@RestController
@RequestMapping(path = "v1/shopping")
public class ShoppingController {

    @Autowired
    ShoppingService shoppingService;

    @PostMapping
    public ResponseEntity AdicionarCompra(@RequestBody Shopping shopping){
        var service = shoppingService.adicionarCompra(shopping);
        if (!service){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Nao foi possivel cadastrar usuario");
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Shopping> obterPorId(@PathVariable("cpf") BigInteger id){

        var service = shoppingService.obterCompraPorId(id);
        if (null == service){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
/*
    @PostMapping("/verificar")
    public ResponseEntity ValidarCompra(@RequestBody Pedido){
//        shoppingService.validarCompra(pedido);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }*/
}
