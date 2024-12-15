package com.example.pruebas.Producto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Producto {

    private Long id;
    private String nombre;
    private String descripcion;
    private double precio;
}
