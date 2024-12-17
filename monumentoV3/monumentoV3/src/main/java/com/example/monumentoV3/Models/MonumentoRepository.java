package com.example.monumentoV3.Models;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class MonumentoRepository {

    private HashMap<Long, Monumento> monumentos;
    private AtomicLong counter = new AtomicLong(0);


    public Monumento addMonumento(Monumento monumento) {
        Long id = counter.incrementAndGet();
        monumento.setId(id);
        monumentos.put(monumento.getId(), monumento);
        return monumento;
    }

    public Optional<Monumento> getMonumento(Long id) {
        return Optional.ofNullable(monumentos.get(id));
    }

    public List<Monumento> getAllMonumentos() {
        return List.copyOf(monumentos.values());
    }

    public Optional<Monumento> updateMonumento(Long id, Monumento newValue) {
        return Optional.ofNullable(monumentos.computeIfPresent(id, (k, v) -> {
                    v.setNombreMonumento(newValue.getNombreMonumento());
                    v.setDescripcion(newValue.getDescripcion());
                    v.setLatitud(newValue.getLatitud());
                    v.setLongitud(newValue.getLongitud());
                    return v;
                }
        ));
    }

    public void deleteMonumento(Long id) {
        monumentos.remove(id);
    }

}
