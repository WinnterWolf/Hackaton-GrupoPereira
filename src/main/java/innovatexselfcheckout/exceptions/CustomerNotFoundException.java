package innovatexselfcheckout.exceptions;

public class CustomerNotFoundException extends RuntimeException{

    private static final String MESSAGE = "Customer Not Found";

    public CustomerNotFoundException() {
        super(MESSAGE);
    }
}
