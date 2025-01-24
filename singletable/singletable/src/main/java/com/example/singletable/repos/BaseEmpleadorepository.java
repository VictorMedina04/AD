package com.example.singletable.repos;

import com.example.singletable.models.Empleado;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

public interface BaseEmpleadorepository extends JpaRepository<Empleado,Long> {

}
