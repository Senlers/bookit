package com.bookit.exception;

import com.bookit.exception.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    private static final String INVALID_CREDENTIALS = "INVALID_CREDENTIALS";

    @ExceptionHandler(InvalidCredentialsException.class)
    public ResponseEntity<ErrorResponse> handleInvalidCredentials() {
        ErrorResponse invalidCredentialsError = new ErrorResponse();
        invalidCredentialsError.setError(INVALID_CREDENTIALS);
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(invalidCredentialsError);
    }
}
