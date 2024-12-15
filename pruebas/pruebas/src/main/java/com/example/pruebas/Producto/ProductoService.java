package com.example.pruebas.Producto;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoService {

    private final ProductoRepository productoRepository;

    public List<Producto> getAll() {
        List<Producto> productos = productoRepository.getAll();
        if (productos.isEmpty()) {
            throw new ProductoNotFoundException();
        } else
            return productos;
    }

    public List<Producto> getProductoByNombre(String nombre, String sortBy) {
        List<Producto> result = productoRepository.getProductosByNombre(nombre, sortBy);
        if (result.isEmpty()) {
            throw new ProductoNotFoundException();
        }
        return result;
    }

    public Producto getProductoById(Long id) {

        return productoRepository.get(id).orElseThrow(() -> new ProductoNotFoundException(id));

    }
}
