package com.example.singletable.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("D")
public class Director extends Empleado {

    public Director(String nombre, String apellidos,
                    String departamento, double sueldo) {
        super(nombre,apellidos,departamento,sueldo);
    }
}
