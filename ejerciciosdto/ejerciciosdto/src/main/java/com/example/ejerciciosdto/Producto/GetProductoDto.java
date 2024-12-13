package com.example.ejerciciosdto.Producto;

public record GetProductoDto(
        String nombre,
        double pvp,
        String imagen,
        String categoria
) {
    
}
