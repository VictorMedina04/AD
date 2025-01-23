package com.example.singletable.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("G")
public class Gerente extends Empleado {

    private int numEmpleados;

    public Gerente (Long id,String nombre,String apellidos, String departamento, double sueldo,int numEmpleados){
        super(id,nombre,apellidos,departamento,sueldo);
        this.numEmpleados=numEmpleados;
    }
}
