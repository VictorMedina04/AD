package com.example.ejeval01.dto;

import com.example.ejeval01.models.Place;

public record GetPlaceDto(
        String name,
        String direccion,
        String localizacion,
        String imagen
) {

    public static GetPlaceDto of(Place place){
        return new GetPlaceDto(
                place.getName(),
                place.getDireccion(),
                place.getLocalizacion(),
                place.getImagen()
        );
    }
}
