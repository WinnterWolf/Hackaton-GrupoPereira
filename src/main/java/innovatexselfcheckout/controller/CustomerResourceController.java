package innovatexselfcheckout.controller;

import innovatexselfcheckout.model.Customer;
import innovatexselfcheckout.repository.CustomerRepository;
import innovatexselfcheckout.repository.entity.CustomerEntity;
import innovatexselfcheckout.service.ICustomerService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "v1/customers")
public class CustomerResourceController {

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
