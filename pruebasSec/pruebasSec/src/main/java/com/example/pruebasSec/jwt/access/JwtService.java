package com.example.pruebasSec.jwt.access;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;

@Service
public class JwtService {


    public  static  final  String TOKEN_TYPE = "JWT";
    public  static  final  String TOKEN_HEADER = "Authorization";
    public  static  final  String TOKEN_PREFIX = "Bearer";

    @Value("$(jwt.secret)")
    private String jwtSecret;

    @Value("$(jwt.duration)")
    private Long jwtLifeMinutes;

    private JwtPa jwtParser;

    private SecretKey secretKey;

    @PostConstruct
    public void init(){
        secretKey = Keys.hma
    }
}
