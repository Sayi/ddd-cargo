package com.deepoove.cargo.infrastructure.event.comsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.deepoove.cargo.application.command.CargoCmdService;
import com.deepoove.cargo.domain.aggregate.cargo.CargoBookDomainEvent;
import com.google.common.eventbus.Subscribe;

@Component
public class CargoListener {
    
    @Autowired
    private CargoCmdService cargoCmdService;

    @Subscribe
    public void recordCargoBook(CargoBookDomainEvent event) {
        // invoke application service or domain service
        System.out.println("CargoListener: recordCargoBook......");
    }
}
