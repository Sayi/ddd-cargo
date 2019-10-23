package org.deepoove.cargo.query.service;

import org.deepoove.cargo.query.dto.CargoHandlingEventDTO;

public interface TrackQueryService {
    
    CargoHandlingEventDTO queryHistory(String cargoId);

}
