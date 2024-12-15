package com.example.pruebas.Producto;

import org.hibernate.query.SortDirection;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class ProductoRepository {

    private HashMap<Long, Producto> productos;

    public Producto add(Producto producto) {
        productos.put(producto.getId(), producto);
        return producto;
    }

    public Optional<Producto> get(Long id) {
        return Optional.ofNullable(productos.get(id));
    }

    public List<Producto> getAll() {
        return new ArrayList<Producto>(productos.values());
    }

    public Optional<Producto> edit(Long id, Producto producto) {
        return Optional.ofNullable(productos.computeIfPresent(id, (k, v) -> {
            v.setNombre(producto.getNombre());
            v.setDescripcion(producto.getDescripcion());
            v.setPrecio(producto.getPrecio());
            return v;
        }));
    }

    public void delete(Long id) {
        productos.remove(id);
    }

    public List<Producto> getProductosByNombre(String nombre, String sortDirection) {
        List<Producto> data = new ArrayList<>(productos.values());
        List<Producto> result;

        if (nombre.equalsIgnoreCase("all")) {
            result = data;
        } else {
            result = data.stream().filter(p -> p.getNombre().equalsIgnoreCase(nombre)).collect(Collectors.toCollection(ArrayList::new));
        }

        if (sortDirection.equalsIgnoreCase("asc")) {
            result.sort(Comparator.comparing(Producto::getNombre));
        }else if (sortDirection.equalsIgnoreCase("desc")) {
            result.sort(Comparator.comparing(Producto::getNombre).reversed());
        }
        return Collections.unmodifiableList(result);
    }
}
