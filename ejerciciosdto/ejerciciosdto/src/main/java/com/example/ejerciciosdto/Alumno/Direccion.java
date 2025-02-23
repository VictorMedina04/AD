package com.example.ejerciciosdto.Alumno;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Direccion {

    private Long id;
    private String tipoVia, linea1, linea2, cp, poblacion, provincia;
}
