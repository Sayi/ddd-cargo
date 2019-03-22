package com.deepoove.cargo.infrastructure.db.dataobject;

import java.util.Date;

public class HandlingEventDO {

    private String id;

    private String cargoId;
    /**
     * 0:receiver 1:load 2:unload 3:end
     */
    private int eventType;
    private Date datetime;
    private String scheduleId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

}
