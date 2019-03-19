package com.deepoove.cargo.domain.aggregate.cargo;

public interface CargoRepository {

    Cargo find(String id);

    void save(Cargo cargo);

}
