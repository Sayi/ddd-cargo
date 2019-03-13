package com.deepoove.cargo.application.service.query;

import com.deepoove.cargo.application.dto.CargoHandlingEventDTO;

public interface TrackQueryService {
    
    CargoHandlingEventDTO queryHistory(String cargoId);

}
