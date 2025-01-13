package com.salesianos.asociaciones.dto;

import com.salesianos.asociaciones.models.Producto;

public record GetProductoDto(
        Long id,
        String nombre,
        double precio,
        GetCategoriaDto categoria
) {

    public static GetProductoDto of(Producto producto) {
        return new GetProductoDto(
                producto.getId(),
                producto.getNombre(),
                producto.getPrecio(),
                GetCategoriaDto.of(producto.getCategoria())
        );
    }
}
