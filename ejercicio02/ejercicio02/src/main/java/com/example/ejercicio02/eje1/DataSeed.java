package com.example.ejercicio02.eje1;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DataSeed {

    private final ProductoRepository productoRepository;
    private final CategoriaRepository categoriaRepository;

    @PostConstruct
    public void run() {

        List<Producto> productos;
        Producto p = Producto.builder()
                .nombre("Un producto")
                .pvp(123.45)
                .build();
        Categoria c = Categoria.builder().nombre("cat1").build();


    }
}
