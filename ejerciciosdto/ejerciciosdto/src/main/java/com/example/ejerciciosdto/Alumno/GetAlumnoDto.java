package com.example.ejerciciosdto.Alumno;

public record GetAlumnoDto(
        String nombre,
        String apellidos,
        String email,
        String curso,
        String direccion
) {
    public static GetAlumnoDto ofAlumno(Alumno alumno) {
        return new GetAlumnoDto(
                alumno.getNombre(),
                alumno.getApellido1() + " " + alumno.getApellido2(),
                alumno.getEmail(),
                alumno.getCurso().getNombre(),
                alumno.getDireccion().getTipoVia() + " " + alumno.getDireccion().getLinea1() + " " + alumno.getDireccion().getLinea2()
        );
    }
}
