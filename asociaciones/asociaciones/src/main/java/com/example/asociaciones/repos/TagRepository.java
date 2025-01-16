package com.example.asociaciones.repos;

import com.example.asociaciones.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Long> {
}
