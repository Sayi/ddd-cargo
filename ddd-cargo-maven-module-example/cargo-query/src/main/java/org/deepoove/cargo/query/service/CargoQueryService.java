package org.deepoove.cargo.query.service;

import java.util.List;

import org.deepoove.cargo.query.dto.CargoDTO;
import org.deepoove.cargo.query.qry.CargoFindbyCustomerQry;

public interface CargoQueryService {

    List<CargoDTO> queryCargos();

    List<CargoDTO> queryCargos(CargoFindbyCustomerQry qry);

}
