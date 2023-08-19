package innovatexselfcheckout.service;

import innovatexselfcheckout.model.Customer;

import javax.swing.text.StyledEditorKit;
import java.util.List;
import java.util.Optional;

public interface ICustomerService {

    List<Customer> obterTodosCostumer();
    Boolean addCustomer(Customer customer);

    Boolean deleteCustomer(String cpf);

    Customer getCustomerByCpf(String cpf);
}
