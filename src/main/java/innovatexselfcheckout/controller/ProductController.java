package innovatexselfcheckout.controller;

import innovatexselfcheckout.model.Product;
import innovatexselfcheckout.model.Shopping;
import innovatexselfcheckout.service.IProductService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "ProductController")
@RestController
@RequestMapping(path = "v1/product")
public class ProductController {

    @Autowired
    IProductService productService;

    @Operation(summary = "Obtem todos os produtos cadastrados")

    @GetMapping(path = "/obterTodos")
    public ResponseEntity<List<Product>> obterTodosProdutos(){
        var service = productService.obterTodos();
        if (service.isEmpty()){
            ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nao possui produto cadastrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(service);
    }


    @Operation(summary = "Adiciona Produto")

    @PostMapping
    public ResponseEntity adicionarProduto(@RequestBody Product product) {
        var service = productService.adicionarProduto(product);
        if (!service){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
