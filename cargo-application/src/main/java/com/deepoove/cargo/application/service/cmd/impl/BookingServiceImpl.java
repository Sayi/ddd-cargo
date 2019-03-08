package com.deepoove.cargo.application.service.cmd.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepoove.cargo.application.co.CargoCO;
import com.deepoove.cargo.application.service.cmd.BookingService;
import com.deepoove.cargo.domain.aggregate.cargo.Cargo;
import com.deepoove.cargo.domain.aggregate.cargo.CargoRepository;

@Service
public class BookingServiceImpl implements BookingService{
    
    @Autowired
    private CargoRepository cargoRepository;

    @Override
    public void book(CargoCO cargoCO) {
        
        cargoCO = null;
        
        Cargo caogo = null;
        
        cargoRepository.save(caogo);
        
    }

}
