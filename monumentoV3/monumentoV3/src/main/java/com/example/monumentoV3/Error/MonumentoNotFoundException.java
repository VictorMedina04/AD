package com.example.monumentoV3.Error;

public class MonumentoNotFoundException extends RuntimeException {

    public MonumentoNotFoundException(Long id) {
        super("No hay monumentos con esa Id = %d".formatted(id));
    }

    public MonumentoNotFoundException() {
        super("No se han encontrado monumentos");
    }

    public MonumentoNotFoundException(String msg) {
        super(msg);
    }
}
