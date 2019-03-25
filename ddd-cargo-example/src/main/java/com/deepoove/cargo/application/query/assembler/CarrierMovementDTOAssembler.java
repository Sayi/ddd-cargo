package com.deepoove.cargo.application.query.assembler;

import java.text.SimpleDateFormat;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.deepoove.cargo.application.query.dto.CarrierMovementDTO;
import com.deepoove.cargo.infrastructure.db.dataobject.CarrierMovementDO;
import com.deepoove.cargo.infrastructure.db.mapper.LocationMapper;

@Component
public class CarrierMovementDTOAssembler
        implements Function<CarrierMovementDO, CarrierMovementDTO> {

    @Autowired
    private LocationMapper locationMapper;

    @Override
    public CarrierMovementDTO apply(CarrierMovementDO t) {
        CarrierMovementDTO dto = new CarrierMovementDTO();
        dto.setStartTime(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(t.getStartTime()));
        dto.setArriveTime(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(t.getStartTime()));
        dto.setFromLocationId(t.getFromLocationId());
        dto.setToLocationId(t.getToLocationId());
        dto.setScheduleId(t.getScheduleId());
        dto.setFromLocationName(locationMapper.select(t.getFromLocationId()).getName());
        dto.setToLocationName(locationMapper.select(t.getToLocationId()).getName());
        return dto;
    }

}
