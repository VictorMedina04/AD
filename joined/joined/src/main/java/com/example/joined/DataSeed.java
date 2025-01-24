package com.example.joined;

import com.example.joined.models.Socio;
import com.example.joined.models.SocioVip;
import com.example.joined.repos.SocioRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataSeed {

    private final SocioRepository socioRepository;

    @PostConstruct
    public void init(){
        Socio socio1 = Socio.builder().nombre("D").apellidos("F").email("g@sd.com").build();
        socioRepository.save(socio1);
        SocioVip socio2 = SocioVip.builder().nombre("D").apellidos("F").email("g@sd.com").pagoMensual(436).build();
        socioRepository.save(socio2);

        System.out.println(socio1);
        System.out.println(socio2);
    }
}
