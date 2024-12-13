package com.example.ejemplo.dto;

import com.example.ejemplo.models.Product;

public record CreateProductDto (
        String name,
        double price
) {

    public Product toProduct () {
        return new Product(null, this.name, this.price);
    }
}
