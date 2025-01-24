package com.example.singletable;

import com.example.singletable.models.Director;
import com.example.singletable.models.Gerente;
import com.example.singletable.repos.BaseEmpleadorepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataSeed {

    private final BaseEmpleadorepository baseEmpleadorepository;

    @PostConstruct
    public void init() {


        Gerente empleado1 = new Gerente( "Jose", "Ramirez", "Ventas", 1450.00, 50);
        baseEmpleadorepository.save(empleado1);
        Director empleado2 = new Director( "Pepe", "Rodriguez", "Marketing", 321.00);
        baseEmpleadorepository.save(empleado2);

        System.out.println(empleado1);
        System.out.println(empleado2);
    }
}
