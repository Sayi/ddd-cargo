package com.deepoove.cargo.application.service.query.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.deepoove.cargo.application.dto.CargoDTO;
import com.deepoove.cargo.application.qry.CargoFindbyCustomerQry;
import com.deepoove.cargo.application.service.query.CargoQueryService;
import com.deepoove.cargo.domain.aggregate.cargo.Cargo;
import com.deepoove.cargo.domain.aggregate.cargo.CargoRepository;

public class CargoQueryServiceImpl implements CargoQueryService {

    @Autowired
    private CargoRepository cargoRepository;

    @Override
    public List<CargoDTO> queryCargos() {
        List<Cargo> cargos = cargoRepository.findAll();

        // convertor

        List<CargoDTO> CargoDTOs = null;

        return CargoDTOs;
    }

    @Override
    public List<CargoDTO> queryCargos(CargoFindbyCustomerQry qry) {
        List<Cargo> cargos = cargoRepository.findByCustomerId(qry.getCustomerId());
        
        // convertor

        List<CargoDTO> CargoDTOs = null;

        return CargoDTOs;
    }

}
