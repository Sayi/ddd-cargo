package com.deepoove.cargo.application.service.query;

import java.util.List;

import com.deepoove.cargo.application.dto.CargoDTO;
import com.deepoove.cargo.application.qry.CargoFindbyCustomerQry;

public interface CargoQueryService {

    List<CargoDTO> queryCargos();

    List<CargoDTO> queryCargos(CargoFindbyCustomerQry qry);

}
