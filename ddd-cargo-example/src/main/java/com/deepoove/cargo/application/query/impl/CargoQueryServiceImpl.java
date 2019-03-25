package com.deepoove.cargo.application.query.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepoove.cargo.application.query.CargoQueryService;
import com.deepoove.cargo.application.query.assembler.CargoDTOAssembler;
import com.deepoove.cargo.application.query.dto.CargoDTO;
import com.deepoove.cargo.application.query.qry.CargoFindbyCustomerQry;
import com.deepoove.cargo.infrastructure.db.dataobject.CargoDO;
import com.deepoove.cargo.infrastructure.db.mapper.CargoMapper;

@Service
public class CargoQueryServiceImpl implements CargoQueryService {

    @Autowired
    private CargoMapper cargoMapper;
    
    @Autowired
    private CargoDTOAssembler converter;

    @Override
    public List<CargoDTO> queryCargos() {
        List<CargoDO> cargos = cargoMapper.selectAll();
        return cargos.stream().map(converter::apply).collect(Collectors.toList());
    }

    @Override
    public List<CargoDTO> queryCargos(CargoFindbyCustomerQry qry) {
        List<CargoDO> cargos = cargoMapper.selectByCustomer(qry.getCustomerPhone());
        return cargos.stream().map(converter::apply).collect(Collectors.toList());
    }

    @Override
    public CargoDTO getCargo(String cargoId) {
        CargoDO select = cargoMapper.select(cargoId);
        return converter.apply(select);
    }

}
