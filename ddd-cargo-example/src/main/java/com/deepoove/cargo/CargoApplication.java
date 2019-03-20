package com.deepoove.cargo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnableCaching
//@ComponentScan(basePackages= {"com.deepoove.cargo"})
@MapperScan("com.deepoove.cargo.infrastructure.db.mapper")
public class CargoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CargoApplication.class, args);
    }

}
