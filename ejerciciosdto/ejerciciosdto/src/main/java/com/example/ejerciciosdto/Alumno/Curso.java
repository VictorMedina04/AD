package com.example.ejerciciosdto.Alumno;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
    private Long id;
    private String nombre, tutor, aula, tipo;
}
