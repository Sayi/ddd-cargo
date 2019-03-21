package com.deepoove.cargo.application.query.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.deepoove.cargo.application.query.TrackQueryService;
import com.deepoove.cargo.application.query.assembler.CargoDTOAssembler;
import com.deepoove.cargo.application.query.assembler.HandlingEventDTOAssembler;
import com.deepoove.cargo.application.query.dto.CargoDTO;
import com.deepoove.cargo.application.query.dto.CargoHandlingEventDTO;
import com.deepoove.cargo.application.query.dto.HandlingEventDTO;
import com.deepoove.cargo.application.query.qry.EventFindbyCargoQry;
import com.deepoove.cargo.infrastructure.db.dataobject.CargoDO;
import com.deepoove.cargo.infrastructure.db.dataobject.HandlingEventDO;
import com.deepoove.cargo.infrastructure.db.mapper.CargoMapper;
import com.deepoove.cargo.infrastructure.db.mapper.CarrierMovementMapper;
import com.deepoove.cargo.infrastructure.db.mapper.HandlingEventMapper;

public class TrackQueryServiceImpl implements TrackQueryService {

    @Autowired
    private HandlingEventMapper handlingEventMapper;

    @Autowired
    private CargoMapper cargoMapper;

    @Autowired
    private CargoDTOAssembler converter;
    @Autowired
    private HandlingEventDTOAssembler handlingEventDTOAssembler;

    @Override
    public CargoHandlingEventDTO queryHistory(EventFindbyCargoQry qry) {

        CargoDO cargo = cargoMapper.select(qry.getCargoId());
        List<HandlingEventDO> events = handlingEventMapper.selectByCargo(qry.getCargoId());

        // convertor
        CargoDTO cargoDTO = converter.apply(cargo);
        List<HandlingEventDTO> dtoEvents = events.stream().map(handlingEventDTOAssembler::apply)
                .collect(Collectors.toList());

        CargoHandlingEventDTO cargoHandlingEventDTO = new CargoHandlingEventDTO();
        cargoHandlingEventDTO.setCargo(cargoDTO);
        cargoHandlingEventDTO.setEvents(dtoEvents);

        return cargoHandlingEventDTO;
    }

}
