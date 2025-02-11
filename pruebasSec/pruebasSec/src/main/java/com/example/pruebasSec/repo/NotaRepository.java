package com.example.pruebasSec.repo;

import com.example.pruebasSec.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NotaRepository extends JpaRepository<Nota, Long> {
}
