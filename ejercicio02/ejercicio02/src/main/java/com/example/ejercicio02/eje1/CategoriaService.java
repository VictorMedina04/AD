package com.example.ejercicio02.eje1;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;


    public List<Categoria> findAll() {
        List<Categoria> result = categoriaRepository.findAll();
        if (result.isEmpty()) {
            throw new EntityNotFoundException("Lista vacía");
        }
        return result;
    }

    public Categoria findById(Long id) {
        Optional<Categoria> result = categoriaRepository.findById(id);
        if (result.isEmpty()) {
            throw new EntityNotFoundException("No hay categoría");
        }
        return result.get();
    }

    public void addCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    public void editCategoria(Categoria editCat, Long id) {
        categoriaRepository.findById(id).map(categoria -> {
            categoria.setNombre(editCat.getNombre());
            categoria.setProductos(editCat.getProductos());
            return categoriaRepository.save(categoria);
        }).orElseThrow(() -> new EntityNotFoundException("No hay categoría"));
    }

    public void deleteCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }
}
