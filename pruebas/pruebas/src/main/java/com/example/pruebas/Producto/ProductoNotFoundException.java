package com.example.pruebas.Producto;

public class ProductoNotFoundException extends RuntimeException{

    public ProductoNotFoundException(){
        super("No se ha encontrado el producto");
    }

    public ProductoNotFoundException(String mensaje){
        super(mensaje);
    }
    public ProductoNotFoundException(Long id){
        super("No hay producto con ese ID: %d".formatted(id));
    }
}
