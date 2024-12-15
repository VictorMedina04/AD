package com.example.pruebas.Producto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalErrorController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ProductoNotFoundException.class)
    public ProblemDetail handleProductoNotFoundException(ProductoNotFoundException ex) {
        ProblemDetail result = ProblemDetail.forStatusAndDetail(
                HttpStatus.NOT_FOUND,ex.getMessage());
        result.setTitle("Producto no encontrado");
        return result;
    }

}
