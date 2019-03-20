package com.deepoove.cargo.infrastructure.db.converter;

import org.springframework.beans.BeanUtils;

import com.deepoove.cargo.domain.aggregate.carriermovement.CarrierMovement;
import com.deepoove.cargo.infrastructure.db.dataobject.CarrierMovementDO;

public class CarrierMovementConverter {

    public static CarrierMovementDO serialize(CarrierMovement location) {
        CarrierMovementDO target = new CarrierMovementDO();
        BeanUtils.copyProperties(location, target);
        return target;
    }

    public static CarrierMovement deserialize(CarrierMovementDO locationDO) {
        CarrierMovement target = new CarrierMovement();
        BeanUtils.copyProperties(locationDO, target);
        return target;
    }

}
