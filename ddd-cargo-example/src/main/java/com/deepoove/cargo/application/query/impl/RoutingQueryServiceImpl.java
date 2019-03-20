package com.deepoove.cargo.application.query.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepoove.cargo.application.query.RoutingQueryService;
import com.deepoove.cargo.infrastructure.db.dataobject.CarrierMovementDO;
import com.deepoove.cargo.infrastructure.db.dataobject.LocationDO;
import com.deepoove.cargo.infrastructure.db.mapper.CarrierMovementMapper;
import com.deepoove.cargo.infrastructure.db.mapper.LocationMapper;

@Service
public class RoutingQueryServiceImpl implements RoutingQueryService {

    @Autowired
    private CarrierMovementMapper carrierMovementMapper;
    @Autowired
    private LocationMapper locationMapper;

    @Override
    public List<CarrierMovementDO> queryCarriers() {
        return carrierMovementMapper.selectAll();
    }

    @Override
    public List<LocationDO> queryLocations() {
        return locationMapper.selectAll();
    }

}
