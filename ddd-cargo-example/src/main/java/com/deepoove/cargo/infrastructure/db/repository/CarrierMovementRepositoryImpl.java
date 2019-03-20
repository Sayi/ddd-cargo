package com.deepoove.cargo.infrastructure.db.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.deepoove.cargo.domain.aggregate.carriermovement.CarrierMovement;
import com.deepoove.cargo.domain.aggregate.carriermovement.CarrierMovementRepository;
import com.deepoove.cargo.infrastructure.db.converter.CarrierMovementConverter;
import com.deepoove.cargo.infrastructure.db.dataobject.CarrierMovementDO;
import com.deepoove.cargo.infrastructure.db.mapper.CarrierMovementMapper;

@Component
public class CarrierMovementRepositoryImpl implements CarrierMovementRepository {

    @Autowired
    private CarrierMovementMapper mapper;

    @Override
    public CarrierMovement find(String id) {
        CarrierMovementDO carrierMovementDO = mapper.select(id);
        return CarrierMovementConverter.deserialize(carrierMovementDO);
    }

}
