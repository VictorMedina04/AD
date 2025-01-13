package com.salesianos.data.repos;

import com.salesianos.data.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {


}
