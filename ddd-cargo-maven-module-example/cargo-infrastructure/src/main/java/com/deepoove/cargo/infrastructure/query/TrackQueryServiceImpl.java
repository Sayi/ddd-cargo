package com.deepoove.cargo.infrastructure.query;

import java.util.List;

import org.deepoove.cargo.query.dto.CargoHandlingEventDTO;
import org.deepoove.cargo.query.service.TrackQueryService;
import org.springframework.beans.factory.annotation.Autowired;

import com.deepoove.cargo.domain.aggregate.cargo.Cargo;
import com.deepoove.cargo.domain.aggregate.cargo.CargoRepository;
import com.deepoove.cargo.domain.aggregate.handlingevent.HandlingEvent;
import com.deepoove.cargo.domain.aggregate.handlingevent.HandlingEventRepository;

public class TrackQueryServiceImpl implements TrackQueryService {

//    @Autowired
//    private HandlingEventRepository handlingEventRepository;
//    
//    @Autowired
//    private CargoRepository cargoRepository;

    @Override
    public CargoHandlingEventDTO queryHistory(String cargoId) {

//        List<HandlingEvent> events = handlingEventRepository.findByCargo(cargoId);
//
//        Cargo cargo = cargoRepository.find(cargoId);
        // convertor
        CargoHandlingEventDTO cargoHandlingEventDTO = null;

        return cargoHandlingEventDTO;
    }

}
