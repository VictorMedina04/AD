package com.salesianos.asociaciones.repos;

import com.salesianos.asociaciones.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
