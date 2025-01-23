package com.example.mappedsuperclass.repos;

import com.example.mappedsuperclass.models.Moto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoRepository extends JpaRepository<Moto,Long> {
}
