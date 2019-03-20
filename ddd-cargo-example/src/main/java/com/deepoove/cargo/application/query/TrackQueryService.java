package com.deepoove.cargo.application.query;

import com.deepoove.cargo.application.query.dto.CargoHandlingEventDTO;
import com.deepoove.cargo.application.query.qry.EventFindbyCargoQry;

public interface TrackQueryService {
    
    CargoHandlingEventDTO queryHistory(EventFindbyCargoQry qry);


}
