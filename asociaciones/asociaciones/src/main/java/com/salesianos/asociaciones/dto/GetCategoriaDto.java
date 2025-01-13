package com.salesianos.asociaciones.dto;

import com.salesianos.asociaciones.models.Categoria;

public record GetCategoriaDto(Long id, String nombre) {

    public static GetCategoriaDto of(Categoria categoria) {
        return new GetCategoriaDto(categoria.getId(), categoria.getNombre());
    }
}