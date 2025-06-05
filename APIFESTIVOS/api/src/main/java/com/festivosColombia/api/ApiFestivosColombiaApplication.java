package com.festivosColombia.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.festivos.api")
@EnableJpaRepositories(basePackages = "com.festivos.api.repository")
@EntityScan(basePackages = "com.festivos.api.model")  // <--- AQUÍ ESTABA EL DETALLE
public class ApiFestivosColombiaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiFestivosColombiaApplication.class, args);
    }

}
