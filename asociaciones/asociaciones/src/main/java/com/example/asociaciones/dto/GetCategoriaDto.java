package com.example.asociaciones.dto;

import com.example.asociaciones.models.Categoria;
import com.example.asociaciones.models.Producto;

import java.util.List;

public record GetCategoriaDto(Long id, String nombre, List<Producto> listado) {

    public static GetCategoriaDto of(Categoria categoria) {
        return new GetCategoriaDto(categoria.getId(), categoria.getNombre(),categoria.getProductos());
    }
}