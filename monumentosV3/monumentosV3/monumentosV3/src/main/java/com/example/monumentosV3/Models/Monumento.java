package com.example.monumentosV3.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Monumento {

    private Long id;
    private String nombrePais, nombreCiudad, nombreMonumento, descripcion, imagen, codigoPais;
    private double latitud, longitud;
}