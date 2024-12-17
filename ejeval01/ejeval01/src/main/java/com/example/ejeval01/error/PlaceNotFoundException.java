package com.example.ejeval01.error;


public class PlaceNotFoundException extends RuntimeException {

    public PlaceNotFoundException(String msg) {
        super(msg);
    }

    public PlaceNotFoundException() {
        super();
    }
}
