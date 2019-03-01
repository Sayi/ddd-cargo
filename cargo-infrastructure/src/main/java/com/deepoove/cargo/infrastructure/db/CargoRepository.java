package com.deepoove.cargo.infrastructure.db;

import com.deepoove.cargo.infrastructure.db.dataobject.CargoDO;

public interface CargoRepository {
    
    void save(CargoDO cargo);
    
}
