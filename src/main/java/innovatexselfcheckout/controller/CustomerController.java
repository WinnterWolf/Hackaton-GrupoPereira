package innovatexselfcheckout.controller;

import innovatexselfcheckout.model.Customer;
import innovatexselfcheckout.service.ICustomerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(value = "CustomerController")
@RestController
@RequestMapping(path = "v1/customers")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

//    @GetMapping
//    public ResponseEntity<Customer> getCustomers(){
//        return ResponseEntity.status(HttpStatus.OK).body(customerService.getCustomers());
//    }

    @GetMapping("/{cpf}")
    public ResponseEntity<Customer> getCustomerByCpf(@PathVariable String cpf){
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getCustomerByCpf(cpf));
    }

    @PostMapping
    public ResponseEntity addCustomer(@RequestBody Customer customer){

        final Boolean customerResult = customerService.addCustomer(customer);
        if(customerResult){
            return this.buildSuccessResponse();
        }
        return this.buildFailureResponse();

    }

//    @DeleteMapping("/{cpf}")
//    public ResponseEntity deleteCustomer(@PathVariable("cpf") String cpf){
//        return Optional.of(ResponseEntity.status(HttpStatus.CREATED))
//                .map(customerService.deleteCustomer(cpf))
//                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND));
//    }

    private ResponseEntity<Customer> buildSuccessResponse() {

        return ResponseEntity
                .status(HttpStatus.CREATED).build();
    }

    private ResponseEntity buildFailureResponse() {

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST).build();
    }
}