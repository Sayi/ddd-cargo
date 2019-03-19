package com.deepoove.cargo.application.query;

import com.deepoove.cargo.application.query.dto.CargoHandlingEventDTO;

public interface TrackQueryService {
    
    CargoHandlingEventDTO queryHistory(String cargoId);

}
