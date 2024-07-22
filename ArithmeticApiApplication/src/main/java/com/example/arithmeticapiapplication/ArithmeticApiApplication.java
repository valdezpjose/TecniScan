package com.example.arithmeticapiapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ArithmeticApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArithmeticApiApplication.class, args);
    }

}
