package innovatexselfcheckout.controller.advice;

import innovatexselfcheckout.exceptions.CustomerNotFoundException;
import innovatexselfcheckout.exceptions.InvalidCpfException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class BaseApiAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ CustomerNotFoundException.class })
    public ResponseEntity<Object> handleCustomerNotFoundException(final RuntimeException ex, final WebRequest request){
        return super.handleExceptionInternal(
                ex,
                new ResponseBuilder(ex.getMessage()),
                HttpHeaders.EMPTY,
                HttpStatus.NOT_FOUND,
                request
        );
    }

    @ExceptionHandler({ InvalidCpfException.class })
    public ResponseEntity<Object> handleInvalidCpfException(final RuntimeException ex, final WebRequest request){
        return super.handleExceptionInternal(
                ex,
                new ResponseBuilder(ex.getMessage()),
                HttpHeaders.EMPTY,
                HttpStatus.BAD_REQUEST,
                request
        );
    }
}
