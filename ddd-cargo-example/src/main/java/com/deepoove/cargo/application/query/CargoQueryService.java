package com.deepoove.cargo.application.query;

import java.util.List;

import com.deepoove.cargo.application.query.dto.CargoDTO;
import com.deepoove.cargo.application.query.qry.CargoFindbyCustomerQry;

public interface CargoQueryService {

    List<CargoDTO> queryCargos();

    List<CargoDTO> queryCargos(CargoFindbyCustomerQry qry);

    CargoDTO getCargo(String cargoId);

}
