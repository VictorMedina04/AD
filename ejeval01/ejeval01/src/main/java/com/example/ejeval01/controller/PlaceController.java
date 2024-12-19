package com.example.ejeval01.controller;

import com.example.ejeval01.dto.CreatePlaceDto;
import com.example.ejeval01.dto.GetPlaceDto;
import com.example.ejeval01.dto.ListGetPlaceDto;
import com.example.ejeval01.error.PlaceNotFoundException;
import com.example.ejeval01.models.Place;
import com.example.ejeval01.service.PlaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequiredArgsConstructor
@RequestMapping("/place")
public class PlaceController {

    private final PlaceService placeService;

    @GetMapping("/{id}")
    public GetPlaceDto getPlace(@PathVariable Long id) {
        return GetPlaceDto.of(placeService.getPlaceById(id));
    }

    @GetMapping("/")
    public ListGetPlaceDto getAllPlaces() {
        return ListGetPlaceDto.of(placeService.getAllPlaces());
    }

    @PostMapping("/")
    public ResponseEntity<Place> create(@RequestBody CreatePlaceDto place) {
        return ResponseEntity.status(201)
                .body(
                        placeService.createPlace(place.toPlace())
                );
    }

    @PutMapping("/{id}")
    public Place update(@PathVariable Long id, @RequestBody Place place) {

        return placeService.UpdatePlace(place, id);

    }

}
