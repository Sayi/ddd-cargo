package com.deepoove.cargo.application.query.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.deepoove.cargo.application.query.CargoQueryService;
import com.deepoove.cargo.application.query.converter.CargoDTOConverter;
import com.deepoove.cargo.application.query.dto.CargoDTO;
import com.deepoove.cargo.application.query.qry.CargoFindbyCustomerQry;
import com.deepoove.cargo.infrastructure.db.dataobject.CargoDO;
import com.deepoove.cargo.infrastructure.db.mapper.CargoMapper;

public class CargoQueryServiceImpl implements CargoQueryService {

    @Autowired
    private CargoMapper cargoMapper;

    @Override
    public List<CargoDTO> queryCargos() {
        List<CargoDO> cargos = cargoMapper.findAll();

        // converter
        List<CargoDTO> CargoDTOs = cargos.stream().map(CargoDTOConverter::convert)
                .collect(Collectors.toList());

        return CargoDTOs;
    }

    @Override
    public List<CargoDTO> queryCargos(CargoFindbyCustomerQry qry) {
        List<CargoDO> cargos = cargoMapper.findByCustomerId(qry.getCustomerId());

        // converter
        List<CargoDTO> CargoDTOs = cargos.stream().map(CargoDTOConverter::convert)
                .collect(Collectors.toList());

        return CargoDTOs;
    }

}
