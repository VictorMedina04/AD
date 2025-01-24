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
public class Moto extends Vehiculo {

    private double cilindradas;

    public Moto(String marca, String modelo, String matricula, double cilindradas) {
        super(marca, modelo, matricula);
        this.cilindradas = cilindradas;
    }

}
