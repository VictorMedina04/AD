package com.example.ejeval01.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.net.URI;

@RestControllerAdvice
public class GlobalErrorController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(PlaceNotFoundException.class)
    public ProblemDetail handlePlaceNotFoundException(PlaceNotFoundException ex) {

        ProblemDetail resultado = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, ex.getMessage());
        resultado.setTitle("Place not found");
        resultado.setDetail(ex.getMessage());
        resultado.setInstance(URI.create("https://www.example.com"));
        return resultado;
    }
}
