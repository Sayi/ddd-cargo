package com.deepoove.cargo.application.service.query;

import java.util.List;

import com.deepoove.cargo.application.dto.HandlingEventDTO;

public interface TrackQueryService {
    
    List<HandlingEventDTO> queryHistory(String cargoId);

}
