package com.example.singletable.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String apellidos;
    private String departamento;
    private double sueldo;

    public Empleado(String nombre, String apellidos, String departamento, double sueldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.departamento = departamento;
        this.sueldo = sueldo;
    }
}
