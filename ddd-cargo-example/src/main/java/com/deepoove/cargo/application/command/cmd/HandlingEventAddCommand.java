package com.deepoove.cargo.application.command.cmd;

import java.util.Date;

public class HandlingEventAddCommand {

    private String cargoId;
    /**
     * 0:receive 1:load 2:unload 3:end
     */
    private int eventType;
    
    private Date datetime;
    private String scheduleId;

    public String getCargoId() {
        return cargoId;
    }

    public void setCargoId(String cargoId) {
        this.cargoId = cargoId;
    }

    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
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
