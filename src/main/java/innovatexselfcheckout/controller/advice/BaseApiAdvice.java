package innovatexselfcheckout.controller.advice;

import innovatexselfcheckout.exceptions.CustomerNotFoundException;
import innovatexselfcheckout.exceptions.InvalidCpfException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class BaseApiAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ CustomerNotFoundException.class })
    public ResponseEntity<Object> handleCustomerNotFoundException(final RuntimeException ex){
        return super.handleExceptionInternal(
                ex,
                ex.getMessage(),
                null,
                HttpStatus.NOT_FOUND,
                null
        );
    }

    @ExceptionHandler({ InvalidCpfException.class })
    public ResponseEntity<Object> handleInvalidCpfException(final RuntimeException ex){
        return super.handleExceptionInternal(
                ex,
                ex.getMessage(),
                null,
                HttpStatus.BAD_REQUEST,
                null
        );
    }
}
