package com.example.mappedsuperclass.models;

import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coche extends Vehiculo {

    private double centimetrosCubicos;

    public Coche(Long id, String marca, String modelo, String matricula, double centimetrosCubicos) {
        super(id,marca, modelo, matricula);
        this.centimetrosCubicos = centimetrosCubicos;
    }
}
