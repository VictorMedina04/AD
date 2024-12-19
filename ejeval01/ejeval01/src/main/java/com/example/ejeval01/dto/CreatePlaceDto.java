package com.example.ejeval01.dto;

import com.example.ejeval01.models.Place;

public record CreatePlaceDto(
        String name,
        String direccion,
        String localizacion,
        String imagen
) {

    public Place toPlace() {
        return Place.builder().name(name).direccion(direccion).localizacion(localizacion).imagen(imagen).build();
    }

}
