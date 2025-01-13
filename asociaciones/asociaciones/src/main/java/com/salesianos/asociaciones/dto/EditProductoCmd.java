package com.salesianos.asociaciones.dto;

public record EditProductoCmd(
        String nombre,
        String descripcion,
        double precio,
        Long categoriaId
) {
}