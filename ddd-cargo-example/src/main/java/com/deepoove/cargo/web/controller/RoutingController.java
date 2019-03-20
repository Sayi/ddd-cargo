package com.deepoove.cargo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deepoove.cargo.application.query.RoutingQueryService;
import com.deepoove.cargo.infrastructure.db.dataobject.CarrierMovementDO;
import com.deepoove.cargo.infrastructure.db.dataobject.LocationDO;

@RestController
@RequestMapping("/routing")
public class RoutingController {

    @Autowired
    private RoutingQueryService routingQueryService;

    @RequestMapping(value = "/carrier", method = RequestMethod.GET)
    public List<CarrierMovementDO> carriers() {
        return routingQueryService.queryCarriers();
    }

    @RequestMapping(value = "/location", method = RequestMethod.GET)
    public List<LocationDO> locations() {
        return routingQueryService.queryLocations();
    }

}
