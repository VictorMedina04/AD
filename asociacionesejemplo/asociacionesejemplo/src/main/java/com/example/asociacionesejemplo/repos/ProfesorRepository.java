package com.example.asociacionesejemplo.repos;

import com.example.asociacionesejemplo.models.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor,Long> {
}
