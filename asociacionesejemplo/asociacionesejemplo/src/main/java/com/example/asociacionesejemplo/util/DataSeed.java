package com.example.asociacionesejemplo.util;

import com.example.asociacionesejemplo.models.Asignatura;
import com.example.asociacionesejemplo.models.Profesor;
import com.example.asociacionesejemplo.repos.AsignaturaRepository;
import com.example.asociacionesejemplo.repos.ProfesorRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataSeed {

    public final ProfesorRepository profesorRepository;
    public final AsignaturaRepository asignaturaRepository;


    @PostConstruct
    public void run() {


        Asignatura asignatura1 = Asignatura.builder()
                .nombre("BD")
                .build();
        asignaturaRepository.save(asignatura1);

        Asignatura asignatura2 = Asignatura.builder()
                .nombre("DI")
                .build();
        asignaturaRepository.save(asignatura2);


        Profesor profesor = Profesor.builder()
                .nombre("Luismi")
                .apellidos("Lopez")
                .edad(34)
                .asignatura(asignatura1)
                .build();
        profesorRepository.save(profesor);

        Profesor profesor1 = Profesor.builder()
                .nombre("Miguel")
                .apellidos("Lopez")
                .edad(34)
                .asignatura(asignatura2)
                .build();
        profesorRepository.save(profesor1);

        Profesor profesor2 = Profesor.builder()
                .nombre("Angel")
                .apellidos("Lopez")
                .edad(34)
                .asignatura(asignatura1)
                .build();
        profesorRepository.save(profesor2);



        asignatura1.addProfesor(profesor);
        asignatura1.addProfesor(profesor2);
        asignatura2.addProfesor(profesor1);

        for (Profesor profesorB : asignatura1.getProfesores()) {
            System.out.println(profesorB);
        }
        for (Profesor profesorB : asignatura2.getProfesores()) {
            System.out.println(profesorB);
        }
        System.out.println(asignatura1);
        System.out.println(asignatura2);

    }



}
