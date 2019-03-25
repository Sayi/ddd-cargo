package com.deepoove.cargo.application.query;

import java.util.List;

import com.deepoove.cargo.application.query.dto.CarrierMovementDTO;
import com.deepoove.cargo.infrastructure.db.dataobject.LocationDO;

public interface RoutingQueryService {

    List<CarrierMovementDTO> queryCarriers();
    List<LocationDO> queryLocations();

}
