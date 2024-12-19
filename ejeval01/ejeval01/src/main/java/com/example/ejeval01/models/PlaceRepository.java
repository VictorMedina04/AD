package com.example.ejeval01.models;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class PlaceRepository {

    private HashMap<Long, Place> listado = new HashMap<>();
    private AtomicLong counter = new AtomicLong(0);

    @PostConstruct
    public void init() {
        Place place1 = Place.builder()
                .name("af1")
                .direccion("32")
                .imagen("http//:")
                .localizacion("aqui")
                .listaTags(new ArrayList<>(List.of("ej1", "ej2"))).build();
        add(place1);

        Place place2 = Place.builder()
                .name("af2")
                .direccion("33")
                .imagen("http//:")
                .localizacion("aqui2")
                .listaTags(new ArrayList<>(List.of("ej1", "ej2"))).build();
        add(place2);

    }

    public Place add(Place place) {
        Long id = counter.incrementAndGet();
        place.setId(id);
        listado.put(place.getId(), place);
        return place;
    }

    public List<Place> getAll() {
        return List.copyOf(listado.values());
    }

    public Optional<Place> getById(Long id) {
        return Optional.ofNullable(listado.get(id));
    }

    public Optional<Place> update(Place place, Long id) {
        return Optional.ofNullable(listado.computeIfPresent(id, (k, v) -> {
            v.setName(place.getName());
            v.setDireccion(place.getDireccion());
            v.setImagen(place.getImagen());
            v.setLocalizacion(place.getLocalizacion());
            return v;
        }));
    }

    public void delete(Long id) {
        listado.remove(id);
    }


}
