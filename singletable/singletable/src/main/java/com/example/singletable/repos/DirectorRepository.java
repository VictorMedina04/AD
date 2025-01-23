package com.example.singletable.repos;


import com.example.singletable.models.Director;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;


@Repository
public interface DirectorRepository extends BaseEmpleadorepository<Director> {
}
