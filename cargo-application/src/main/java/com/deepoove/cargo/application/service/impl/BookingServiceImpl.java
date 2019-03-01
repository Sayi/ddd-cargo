package com.deepoove.cargo.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepoove.cargo.application.co.CargoCO;
import com.deepoove.cargo.application.service.BookingService;
import com.deepoove.cargo.domain.aggregate.cargo.Cargo;
import com.deepoove.cargo.infrastructure.db.CargoRepository;
import com.deepoove.cargo.infrastructure.db.dataobject.CargoDO;

@Service
public class BookingServiceImpl implements BookingService{
    
    @Autowired
    private CargoRepository cargoRepository;

    @Override
    public void book(CargoCO cargoCO) {
        
        cargoCO = null;
        
        Cargo caogo = null;
        
        CargoDO cargoDO = null;
        cargoRepository.save(cargoDO);
        
    }

}
