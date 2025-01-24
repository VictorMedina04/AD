package com.example.mappedsuperclass.models;

import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Coche extends Vehiculo {

    private double centimetrosCubicos;

    public Coche(String marca, String modelo, String matricula, double centimetrosCubicos) {
        super(marca, modelo, matricula);
        this.centimetrosCubicos = centimetrosCubicos;
    }
}
