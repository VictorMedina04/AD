package com.example.singletable.repos;

import com.example.singletable.models.Gerente;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public interface GerenteRepository extends BaseEmpleadorepository<Gerente> {
}
