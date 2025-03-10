package com.example.ejemplo.controller;

import com.example.ejemplo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class MainController {


    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/producto/123")
    public Producto getProducto() {
        return new Producto(123L, "Un producto molón");
    }

    @PostMapping("/producto")
    public Producto nuevoProducto(@RequestBody Producto producto) {
        return producto;
    }


    record Producto(Long id, String nombre){}
}
