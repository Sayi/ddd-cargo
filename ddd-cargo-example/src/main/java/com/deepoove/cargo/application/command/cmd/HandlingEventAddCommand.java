package com.deepoove.cargo.application.command.cmd;

import java.util.Date;

import com.deepoove.cargo.domain.aggregate.handlingevent.EventTypeEnum;

public class HandlingEventAddCommand {

    private String cargoId;
    private EventTypeEnum eventType;
    private Date datetime;
    private String scheduleId;

    public String getCargoId() {
        return cargoId;
    }

    public void setCargoId(String cargoId) {
        this.cargoId = cargoId;
    }

    public EventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

}
