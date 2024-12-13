package com.example.ejerciciosdto.Alumno;

public record GetAlumnoDto (
        String nombre,
        String apellidos,
        String email,
        String curso,
        String direccion
){
}
