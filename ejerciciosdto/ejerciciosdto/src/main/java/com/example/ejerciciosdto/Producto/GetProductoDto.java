package com.example.ejerciciosdto.Producto;

public record GetProductoDto(
        String nombre,
        double pvp,
        String imagen,
        String categoria
) {

    public static GetProductoDto ofProducto(Producto producto) {
        return new GetProductoDto(
                producto.getNombre(),
                producto.getPvp(),
                producto.getImagenes().get(0),
                producto.getCategoria().getNombre()
        );
    }
    
}
