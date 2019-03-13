package com.deepoove.cargo.domain.aggregate.cargo;

import java.util.List;

public interface CargoRepository {

    Cargo find(String id);

    List<Cargo> findByCustomerId(String customerId);

    List<Cargo> findAll();

    void save(Cargo cargo);

}
