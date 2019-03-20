package com.deepoove.cargo.application.query;

import java.util.List;

import com.deepoove.cargo.infrastructure.db.dataobject.CarrierMovementDO;
import com.deepoove.cargo.infrastructure.db.dataobject.LocationDO;

public interface RoutingQueryService {

    List<CarrierMovementDO> queryCarriers();
    List<LocationDO> queryLocations();

}
