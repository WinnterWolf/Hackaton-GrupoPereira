package innovatexselfcheckout.exceptions;

public class InvalidCpfException extends RuntimeException {

    private static final String MESSAGE = "Invalid CPF";

    public InvalidCpfException() {
        super(MESSAGE);
    }
}
