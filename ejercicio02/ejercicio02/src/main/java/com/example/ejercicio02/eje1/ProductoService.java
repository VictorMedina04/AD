package com.example.ejercicio02.eje1;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductoService {

    private final ProductoRepository productoRepository;

    //add,edit,find,remove

    public List<Producto> findAll() {
        List<Producto> result = productoRepository.findAll();
        if (result.isEmpty()) {
            throw new EntityNotFoundException("Listado vacio");
        }
        return result;
    }

    public Producto findById(Long id) {

        return productoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No existe este producto"));

    }

    public void addProducto(Producto p) {
        productoRepository.save(p);
    }

    public void editProducto(Producto pEdit, Long id) {
        productoRepository.findById(id).map(producto -> {
            producto.setNombre(pEdit.getNombre());
            producto.setPvp(pEdit.getPvp());
            producto.setCategoria(pEdit.getCategoria());
            return productoRepository.save(producto);
        }).orElseThrow(() -> new EntityNotFoundException("No existe este producto"));
    }

    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);
    }
}
