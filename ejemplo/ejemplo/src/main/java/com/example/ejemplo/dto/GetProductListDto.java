package com.example.ejemplo.dto;

import com.example.ejemplo.models.Product;

import java.util.List;

public record GetProductListDto(
        Long count,
        List<Product> items
) {
    public static GetProductListDto of(List<Product> items) {
        return new GetProductListDto(
                (long) items.size(),
                items
        );
    }

    public List<Product> to() {
        return items;
    }
}
