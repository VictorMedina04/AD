package com.example.singletable.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("D")
public class Director extends Empleado {

    public Director(Long id,String nombre, String apellidos, String departamento, double sueldo) {
        super(id,nombre,apellidos,departamento,sueldo);
    }
}
