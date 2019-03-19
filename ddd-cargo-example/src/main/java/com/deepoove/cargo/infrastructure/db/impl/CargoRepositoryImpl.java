package com.deepoove.cargo.infrastructure.db.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.deepoove.cargo.domain.aggregate.cargo.Cargo;
import com.deepoove.cargo.domain.aggregate.cargo.CargoRepository;
import com.deepoove.cargo.infrastructure.db.dataobject.AppConfig;
import com.deepoove.cargo.infrastructure.db.dataobject.CargoDO;
import com.deepoove.cargo.infrastructure.db.mapper.CargoMapper;

@Component
public class CargoRepositoryImpl implements CargoRepository {
    
    @Autowired
    private CargoMapper cargoMapper;

    @Override
    public Cargo find(String id) {
//        CargoDO cargoDO = cargoMapper.find(id);
        System.out.println(cargoMapper.findConfig("app_android_comment"));
        
        // convertor deseriease
        Cargo cargo = new Cargo(null);
        return cargo;
    }

    @Override
    public List<Cargo> findByCustomerId(String customerId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Cargo> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(Cargo cargo) {
        // TODO Auto-generated method stub

    }

}
