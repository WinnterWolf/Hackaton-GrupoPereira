package innovatexselfcheckout.controller;

import innovatexselfcheckout.model.Pedido;
import innovatexselfcheckout.model.Shopping;
import innovatexselfcheckout.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "v1/shopping")
public class ShoppingController {

    @Autowired
    ShoppingService shoppingService;

    @PostMapping
    public ResponseEntity AdicionarCompra(@RequestBody Shopping shopping){
        shoppingService.adicionarCompra(shopping);


        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
/*
    @PostMapping("/verificar")
    public ResponseEntity ValidarCompra(@RequestBody Pedido){
//        shoppingService.validarCompra(pedido);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }*/
}
