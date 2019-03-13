package com.deepoove.cargo.infrastructure.db.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.deepoove.cargo.domain.aggregate.cargo.Cargo;
import com.deepoove.cargo.domain.aggregate.cargo.CargoRepository;

@Component
public class CargoRepositoryImpl implements CargoRepository {

    @Override
    public Cargo find(String id) {
        // TODO Auto-generated method stub
        
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
