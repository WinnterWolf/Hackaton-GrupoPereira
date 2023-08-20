package innovatexselfcheckout.controller;

import innovatexselfcheckout.model.Product;
import innovatexselfcheckout.model.Shopping;
import innovatexselfcheckout.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "v1/product")
public class ProductController {

    @Autowired
    IProductService productService;


    @PostMapping
    public ResponseEntity adicionarProduto(@RequestBody Product product) {
        var service = productService.adicionarProduto(product);
        if (!service){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
