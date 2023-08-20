package innovatexselfcheckout.controller;

import innovatexselfcheckout.model.Shopping;
import innovatexselfcheckout.service.ShoppingService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@Api(value = "ShoppingController")
@RestController
@RequestMapping(path = "v1/shopping")
public class ShoppingController {

    @Autowired
    ShoppingService shoppingService;

    @Operation(summary = "Adiciona a lista de compra")
    @PostMapping
    public ResponseEntity AdicionarCompra(@RequestBody Shopping shopping){
        var service = shoppingService.adicionarCompra(shopping);
        if (!service){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Nao foi possivel cadastrar usuario");
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Operation(summary = "Obtem a lista de compra por id")
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
