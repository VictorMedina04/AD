package com.example.singletable.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("G")
public class Gerente extends Empleado {

    private int numEmpleados;

    public Gerente (String nombre,String apellidos, String departamento, double sueldo,int numEmpleados){
        super(nombre,apellidos,departamento,sueldo);
        this.numEmpleados=numEmpleados;
    }
}
