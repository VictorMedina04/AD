package com.example.asociaciones.services;

import com.example.asociaciones.dto.EditCategoriaCmd;
import com.example.asociaciones.models.Categoria;
import com.example.asociaciones.repos.CategoriaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public List<Categoria> findAll() {
        List<Categoria> result = categoriaRepository.findAll();
        if (result.isEmpty())
            throw new EntityNotFoundException("No hay categorias con esos criterios de búsqueda");
        return result;
    }

    public Categoria findById(Long id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No hay categoria con ID: " + id));

    }

    public Categoria save(EditCategoriaCmd categoria) {
        return categoriaRepository.save(
                Categoria.builder()
                        .nombre(categoria.nombre())
                        .productos(categoria.productos())
                        .build()
        );
    }

    public Categoria edit(EditCategoriaCmd categoria, Long id) {
        return categoriaRepository.findById(id)
                .map(old -> {
                    old.setNombre(categoria.nombre());
                    return categoriaRepository.save(old);
                })
                .orElseThrow(() -> new EntityNotFoundException("No hay categoria con ID: " + id));

    }

    public void delete(Long id) {
        categoriaRepository.deleteById(id);
    }

}