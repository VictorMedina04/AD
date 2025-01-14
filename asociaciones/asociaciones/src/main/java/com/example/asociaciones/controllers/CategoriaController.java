package com.example.asociaciones.controllers;


import com.example.asociaciones.dto.EditCategoriaCmd;
import com.example.asociaciones.dto.GetCategoriaDto;
import com.example.asociaciones.models.Categoria;
import com.example.asociaciones.services.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
@RequiredArgsConstructor
public class CategoriaController {

    private final CategoriaService categoriaService;

    @GetMapping
    public List<GetCategoriaDto> findAll() {
        return categoriaService.findAll().stream().map(GetCategoriaDto::of).toList();
    }

    @GetMapping("/{id}")
    public Categoria findById(@PathVariable Long id) {
        return categoriaService.findById(id);
    }

    @PostMapping
    public ResponseEntity<Categoria> create (@RequestBody EditCategoriaCmd nuevo){
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaService.save(nuevo));
    }

    @PutMapping("/{id}")
    public Categoria edit(@RequestBody EditCategoriaCmd editado, @PathVariable Long id){
        return categoriaService.edit(editado,id);
    }

    @DeleteMapping()
    public ResponseEntity<?> delete (@PathVariable Long id){
        categoriaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
