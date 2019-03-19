package com.deepoove.cargo.application.query.converter;

import org.springframework.beans.BeanUtils;

import com.deepoove.cargo.application.query.dto.CargoDTO;
import com.deepoove.cargo.infrastructure.db.dataobject.CargoDO;

public class CargoDTOConverter {

    public static CargoDTO convert(CargoDO t) {
        CargoDTO target = new CargoDTO();
        BeanUtils.copyProperties(t, target);
        return target;
    }

}
