package io.codewithwinnie.springmvcrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 * Created by
 * @author Ifeanyichukwu Otiwa
 * 5/2/2022 
 */
 
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = CustomerNotFoundException.MESSAGE)
public class CustomerNotFoundException extends ResponseStatusException {
    
    public final static String MESSAGE = "Customer Not found";
    public CustomerNotFoundException(HttpStatus status) {
        super(status);
    }
    
}
