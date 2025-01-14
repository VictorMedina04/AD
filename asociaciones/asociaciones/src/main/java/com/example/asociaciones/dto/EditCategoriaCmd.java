package com.example.asociaciones.dto;


import com.example.asociaciones.models.Producto;

import java.util.List;

public record EditCategoriaCmd(
        String nombre,
        List<Producto> productos
) {
}