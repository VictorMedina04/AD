package com.example.joined.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@SuperBuilder
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public class Socio {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String apellidos;
    private String email;


    public Socio(String email, String nombre, String apellidos) {
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
}
