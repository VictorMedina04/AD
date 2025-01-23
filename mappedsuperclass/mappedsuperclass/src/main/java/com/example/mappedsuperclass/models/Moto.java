package com.example.mappedsuperclass.models;

import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Moto extends Vehiculo {

    private double cilindradas;

    public Moto(Long id, String marca, String modelo, String matricula, double cilindradas) {
        super(id, marca, modelo, matricula);
        this.cilindradas = cilindradas;
    }

}
