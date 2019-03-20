package com.deepoove.cargo.application.query.dto;

public class HandlingEventDTO {

    private String eventType;
    private String datetime;

    private CarrierMovementDTO carrierMovement;

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public CarrierMovementDTO getCarrierMovement() {
        return carrierMovement;
    }

    public void setCarrierMovement(CarrierMovementDTO carrierMovement) {
        this.carrierMovement = carrierMovement;
    }

}
