package com.example.ejeval01.dto;

import com.example.ejeval01.models.Place;

import java.util.List;

public record ListGetPlaceDto(
        int counter,
        List<GetPlaceDto> items
) {
    public static ListGetPlaceDto of(List<Place> listado){
        return new ListGetPlaceDto(
                listado.size(),
                listado.stream().map(GetPlaceDto::of).toList()
        );
    }
}
