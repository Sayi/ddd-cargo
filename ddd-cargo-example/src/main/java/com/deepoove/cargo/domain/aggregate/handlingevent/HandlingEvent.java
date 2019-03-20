package com.deepoove.cargo.domain.aggregate.handlingevent;

import java.util.Date;
import java.util.UUID;

public class HandlingEvent {

    private String id;
    private String cargoId;
    private Date datetime;
    private EventTypeEnum eventType;

    private String scheduleId;

    public HandlingEvent(String cargoId, Date time, EventTypeEnum eventType) {
        this.id = UUID.randomUUID().toString();
        this.cargoId = cargoId;
        this.eventType = eventType;
        this.datetime = time;
    }

    public static HandlingEvent newHandlingEvent(String cargoId, Date time, EventTypeEnum eventType,
            String scheduleId) {
        HandlingEvent handlingEvent = new HandlingEvent(cargoId, time, eventType);
        handlingEvent.scheduleId = scheduleId;
        return handlingEvent;
    }
    
    public boolean canModifyCargo() {
        return eventType == EventTypeEnum.RECIEVE;
    }

    public Date datetime() {
        return datetime;
    }

    public String cargoId() {
        return cargoId;
    }

    public String id() {
        return id;
    }

    public EventTypeEnum eventType() {
        return eventType;
    }

    public String scheduleId() {
        return scheduleId;
    }

}
