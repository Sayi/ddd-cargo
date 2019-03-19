package com.deepoove.cargo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
// @EnableCaching
//@ComponentScan(basePackages= {"com.deepoove.cargo"})
public class CargoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CargoApplication.class, args);
    }

}
