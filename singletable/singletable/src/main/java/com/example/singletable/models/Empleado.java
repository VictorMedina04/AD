package com.example.singletable.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Empleado {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String apellidos;
    private String departamento;
    private double sueldo;
}
