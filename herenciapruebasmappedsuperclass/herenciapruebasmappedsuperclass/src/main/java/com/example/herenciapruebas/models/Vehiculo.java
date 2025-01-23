package com.example.herenciapruebas.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor@AllArgsConstructor
@ToString
@MappedSuperclass
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String marca;
    private String modelo;
    private String matricula;

}
