package com.deepoove.cargo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.deepoove.cargo.infrastructure.event.comsumer.CargoListener;
import com.google.common.eventbus.EventBus;

@SpringBootApplication
// @EnableCaching
// @ComponentScan(basePackages= {"com.deepoove.cargo"})
@MapperScan("com.deepoove.cargo.infrastructure.db.mapper")
public class CargoApplication {
    
    @Autowired
    CargoListener cargoListener;

    @Bean
    public EventBus configEvent() {
        EventBus eventBus = new EventBus();
        eventBus.register(cargoListener);
        return eventBus;
    }

    public static void main(String[] args) {
        SpringApplication.run(CargoApplication.class, args);
    }

}
