package com.example.ejerciciosdto.Alumno;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Alumno {

    private Long id;
    private String nombre, apellido1, apellido2, email, telefono;
    private Curso curso;
    private Direccion direccion;
}
