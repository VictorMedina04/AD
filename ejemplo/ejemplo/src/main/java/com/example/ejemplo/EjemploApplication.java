package com.example.ejemplo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		description = "Api que sirve como ejemplo para la asignatura de AC",
		version = "1.0",
		contact = @Contact(email = "medina.levic@triana.salesianos.edu"),
		license = @License(name = "Kalise para todos"),
		title = "Api sobre productos"
))
public class EjemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploApplication.class, args);
	}

}
