package com.salesianos.asociaciones.repos;

import com.salesianos.asociaciones.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {


}
