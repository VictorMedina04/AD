package com.example.mappedsuperclass.repos;

import com.example.mappedsuperclass.models.Coche;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CocheRepository extends JpaRepository<Coche,Long> {
}
