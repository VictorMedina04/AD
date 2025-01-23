package com.example.singletable;

import com.example.singletable.models.Director;
import com.example.singletable.models.Gerente;
import com.example.singletable.repos.BaseEmpleadorepository;
import com.example.singletable.repos.DirectorRepository;
import com.example.singletable.repos.GerenteRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataSeed {

    private final BaseEmpleadorepository baseEmpleadorepository;
    private final DirectorRepository directorRepository;
    private final GerenteRepository gerenteRepository;

    @PostConstruct
    public void init() {


        Gerente empleado1 = new Gerente(1L, "Jose", "Ramirez", "Ventas", 1450.00, 50);
        gerenteRepository.save(empleado1);
        Director empleado2 = new Director(1L, "Jose", "Ramirez", "Ventas", 1450.00);
        directorRepository.save(empleado2);

        System.out.println(empleado1);
        System.out.println(empleado2);
    }
}
