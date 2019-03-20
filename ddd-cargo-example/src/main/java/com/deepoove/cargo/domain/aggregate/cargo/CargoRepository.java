package com.deepoove.cargo.domain.aggregate.cargo;

public interface CargoRepository {

    Cargo find(String id);
    
    int sizeByCustomer(String customerPhone);

    void save(Cargo cargo);

    void remove(String id);

}
