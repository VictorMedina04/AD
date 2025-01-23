package com.example.singletable.repos;

import com.example.singletable.models.Empleado;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseEmpleadorepository<T extends Empleado> extends JpaRepository<T,Long> {

}
