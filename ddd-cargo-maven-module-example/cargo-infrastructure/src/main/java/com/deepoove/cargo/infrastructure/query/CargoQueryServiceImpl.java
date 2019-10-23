package com.deepoove.cargo.infrastructure.query;

import java.util.List;

import org.deepoove.cargo.query.dto.CargoDTO;
import org.deepoove.cargo.query.qry.CargoFindbyCustomerQry;
import org.deepoove.cargo.query.service.CargoQueryService;
import org.springframework.beans.factory.annotation.Autowired;

import com.deepoove.cargo.infrastructure.db.mapper.CargoMapper;


public class CargoQueryServiceImpl implements CargoQueryService {

    @Autowired
    private CargoMapper cargoMapper;

    @Override
    public List<CargoDTO> queryCargos() {
//        List<CargoDO> cargos = cargoMapper.selectAll();

        // convertor

        List<CargoDTO> CargoDTOs = null;

        return CargoDTOs;
    }

    @Override
    public List<CargoDTO> queryCargos(CargoFindbyCustomerQry qry) {
//        List<CargoDO> cargos = cargoMapper.selectByCustomer(qry.getCustomerId());
        
        // convertor

        List<CargoDTO> CargoDTOs = null;

        return CargoDTOs;
    }

}
