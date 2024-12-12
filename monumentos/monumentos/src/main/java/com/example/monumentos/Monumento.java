package com.example.monumentos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Monumento {

    private Long id;
    private String nombrePais, nombreCiudad, nombreMonumento, descripcion, urlImagen, codigoPais;
    private double latitud, longitud;
}
