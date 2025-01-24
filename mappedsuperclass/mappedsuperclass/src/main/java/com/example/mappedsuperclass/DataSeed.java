package com.example.mappedsuperclass;

import com.example.mappedsuperclass.models.Coche;
import com.example.mappedsuperclass.models.Moto;
import com.example.mappedsuperclass.models.Vehiculo;
import com.example.mappedsuperclass.repos.CocheRepository;
import com.example.mappedsuperclass.repos.MotoRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DataSeed {

    private final MotoRepository motoRepository;
    private final CocheRepository cocheRepository;


    @PostConstruct
    public void init() {


        Moto vehiculo2 = new Moto("CITROEN", "SS", "5678 BBB", 49);
        motoRepository.save(vehiculo2);

        Coche vehiculo3 = new Coche("PEUGEOT", "GG", "9123 CCC", 652);
        cocheRepository.save(vehiculo3);

        System.out.println(vehiculo2);
        System.out.println(vehiculo3);

    }
}
