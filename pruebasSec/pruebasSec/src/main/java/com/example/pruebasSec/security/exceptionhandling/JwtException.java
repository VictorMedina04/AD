package com.example.pruebasSec.security.exceptionhandling;

public class JwtException extends RuntimeException {

    public JwtException(String msg) {
        super(msg);
    }
}
