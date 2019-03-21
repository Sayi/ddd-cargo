package com.deepoove.cargo.application.query.assembler;

import java.util.function.Function;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.deepoove.cargo.application.query.dto.CargoDTO;
import com.deepoove.cargo.infrastructure.db.dataobject.CargoDO;
import com.deepoove.cargo.infrastructure.db.dataobject.LocationDO;
import com.deepoove.cargo.infrastructure.db.mapper.LocationMapper;

@Component
public class CargoDTOAssembler implements Function<CargoDO, CargoDTO> {

    @Autowired
    private LocationMapper locationMapper;

    public CargoDTO apply(CargoDO t) {
        CargoDTO target = new CargoDTO();
        BeanUtils.copyProperties(t, target);
        LocationDO select = locationMapper.select(t.getOriginLocationCode());
        target.setOriginLocationName(select.getName());
        select = locationMapper.select(t.getDestinationLocationCode());
        target.setDestinationLocationName(select.getName());
        return target;
    }

}
