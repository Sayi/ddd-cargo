package com.deepoove.cargo.infrastructure.mongo.impl;

import org.springframework.stereotype.Component;

import com.deepoove.cargo.domain.aggregate.cargo.Cargo;
import com.deepoove.cargo.domain.aggregate.cargo.CargoRepository;


@Component
public class CargoRepositoryImpl implements CargoRepository{

    @Override
    public void save(Cargo cargo) {
        // TODO Auto-generated method stub
//        CargoDO
    }

}
