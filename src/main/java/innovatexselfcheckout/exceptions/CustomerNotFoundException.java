package innovatexselfcheckout.exceptions;

public class CustomerNotFoundException extends RuntimeException{

    private static final String MESSAGE = "Account not found on core bank";

    public CustomerNotFoundException() {
        super(MESSAGE);
    }
}
