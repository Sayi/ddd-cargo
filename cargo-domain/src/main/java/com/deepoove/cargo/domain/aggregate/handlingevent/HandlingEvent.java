package com.deepoove.cargo.domain.aggregate.handlingevent;

import java.util.Date;

import com.deepoove.cargo.domain.aggregate.cargo.Cargo;
import com.deepoove.cargo.domain.aggregate.carriermovement.CarrierMovement;

public class HandlingEvent {
    private Cargo cargo;
    private Date datetime;
    private EventTypeEnum eventType;
    
    private CarrierMovement carrierMovement;
    
    
    public HandlingEvent(Cargo cargo, EventTypeEnum eventType, Date time) {
        this.cargo = cargo;
        this.eventType = eventType;
        this.datetime = time;
    }
    
    public static HandlingEvent newLoad(Cargo cargo, CarrierMovement movement, Date time) {
        HandlingEvent handlingEvent = new HandlingEvent(cargo, EventTypeEnum.LOAD, time);
        handlingEvent.carrierMovement = movement;
        return handlingEvent;
        
    } 
}
