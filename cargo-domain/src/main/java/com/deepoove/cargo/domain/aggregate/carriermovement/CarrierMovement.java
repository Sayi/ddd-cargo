package com.deepoove.cargo.domain.aggregate.carriermovement;

import java.util.Date;

import com.deepoove.cargo.domain.aggregate.location.Location;

public class CarrierMovement {
    
    private String scheduleId;
    
    private Location fromId;
    private Location toId;
    
    private Date starttime;
    private Date arrivetime;

}
