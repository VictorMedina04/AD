package com.example.monumentos;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monumento")
@RequiredArgsConstructor
public class MonumentoController {


    private final MonumentoRepository monumentoRepository;

    @GetMapping("/lista")
    public ResponseEntity<List<Monumento>> getAll() {
        List<Monumento> result = monumentoRepository.getAll();

        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(result);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Monumento> getById(@PathVariable Long id) {
        return ResponseEntity.of(monumentoRepository.get(id));
    }

    @PostMapping
    public ResponseEntity<Monumento> create(@RequestBody Monumento monumento) {
        return ResponseEntity.status(HttpStatus.CREATED).body(monumentoRepository.add(monumento));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Monumento> editNameById(@PathVariable Long id, @RequestBody Monumento m) {
        return ResponseEntity.of(monumentoRepository.edit(id, m));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Monumento> deleteById(@PathVariable Long id) {
        monumentoRepository.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/listaOrdenada")
    public ResponseEntity<List<Monumento>> getAll(
            @RequestParam(required = false, value = "maxLatitude", defaultValue = "-1") double max,
            @RequestParam(required = false, value = "sort", defaultValue = "no") String sortDirection) {

        List<Monumento> result = monumentoRepository.query(max, sortDirection);

        if (result.isEmpty()) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(result);
    }


}

