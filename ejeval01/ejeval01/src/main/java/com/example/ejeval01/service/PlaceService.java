package com.example.ejeval01.service;

import com.example.ejeval01.error.PlaceNotFoundException;
import com.example.ejeval01.models.Place;
import com.example.ejeval01.models.PlaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaceService {

    private final PlaceRepository placeRepository;

    public Place getPlaceById(Long id) {
        Place buscado = placeRepository.getById(id).get();

        if (buscado == null) {
            throw new PlaceNotFoundException("No hay un place con ese ID = %D".formatted(id));
        }
        return buscado;

    }

    public List<Place> getAllPlaces() {
        List<Place> listado = placeRepository.getAll();
        if (listado.isEmpty()) {
            throw new PlaceNotFoundException("No hay places asi");
        }
        return listado;
    }

    public Place createPlace(Place place) {
        if (place == null)
            throw new PlaceNotFoundException("No hay un place");
        placeRepository.add(place);
        return place;
    }

    public Place UpdatePlace(Place place, Long id) {
        return placeRepository.update(place, id).orElseThrow(() -> new PlaceNotFoundException("No se puede editar"));
    }

}
