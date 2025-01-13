package com.salesianos.data;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoService {

    private final ProductoRepository productoRepository;

    public List<Producto> findAll() {
        List<Producto> resultado = productoRepository.findAll();
        if (resultado.isEmpty()) {
            throw new EntityNotFoundException();
        }
        return resultado;
    }

    public Producto findById(Long id) {
        return productoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No id"));
    }

    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto edit(Producto producto, Long id) {
        return productoRepository.findById(id).map(
                editado -> {
                    editado.setNombre(producto.getNombre());
                    editado.setDescripcion(producto.getDescripcion());
                    editado.setPrecio(producto.getPrecio());
                    return productoRepository.save(editado);
                }).orElseThrow(() -> new EntityNotFoundException("No id"));
    }

    public void delete(Long id) {
        productoRepository.deleteById(id);
    }
}
