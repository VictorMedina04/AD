package com.example.joined.models;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SocioVip extends Socio {

    private double pagoMensual;

    public SocioVip(String email, String nombre, String apellidos, double pagoMensual) {
        super(email, nombre, apellidos);
        this.pagoMensual = pagoMensual;
    }
}
