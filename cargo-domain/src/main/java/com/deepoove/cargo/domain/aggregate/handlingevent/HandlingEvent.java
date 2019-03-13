package com.deepoove.cargo.domain.aggregate.handlingevent;

import java.util.Date;

public class HandlingEvent {

    private String cargoId;
    private Date datetime;
    private EventTypeEnum eventType;

    private String scheduleId;

    public HandlingEvent(String cargoId, EventTypeEnum eventType, Date time) {
        this.cargoId = cargoId;
        this.eventType = eventType;
        this.datetime = time;
    }

    public static HandlingEvent newHandlingEvent(String cargoId, Date time, EventTypeEnum eventType,
            String scheduleId) {
        HandlingEvent handlingEvent = new HandlingEvent(cargoId, eventType, time);
        handlingEvent.scheduleId = scheduleId;
        return handlingEvent;
    }

    public Date datetime() {
        return datetime;
    }

    public String cargoId() {
        return cargoId;
    }

    public EventTypeEnum eventType() {
        return eventType;
    }

    public String scheduleId() {
        return scheduleId;
    }

}
