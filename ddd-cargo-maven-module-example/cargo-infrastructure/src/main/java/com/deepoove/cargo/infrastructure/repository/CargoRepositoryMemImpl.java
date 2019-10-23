package com.deepoove.cargo.infrastructure.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.deepoove.cargo.domain.aggregate.cargo.Cargo;
import com.deepoove.cargo.domain.aggregate.cargo.CargoRepository;

public class CargoRepositoryMemImpl implements CargoRepository {

    private Map<String, Cargo> cargoDb;

    public CargoRepositoryMemImpl() {
        cargoDb = new HashMap<>();
    }

    @Override
    public Cargo find(String id) {
        return cargoDb.get(id);
    }

    @Override
    public List<Cargo> findAll() {
        return new ArrayList<>(cargoDb.values());
    }

    @Override
    public List<Cargo> findByCustomerId(String customerId) {
        return findAll().stream().filter(cargo -> cargo.sender().equals(customerId))
                .collect(Collectors.toList());
    }

    @Override
    public void save(Cargo cargo) {
        cargoDb.put(cargo.id(), cargo);
    }

}
