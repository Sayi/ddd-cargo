package com.deepoove.cargo.application.service.query;

import java.util.List;

import com.deepoove.cargo.application.dto.CargoDTO;

public interface BookingQueryService {

    List<CargoDTO> queryCargos();

    List<CargoDTO> queryCargos(String customerId);

}
