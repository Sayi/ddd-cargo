package com.deepoove.cargo.application.query.dto;

import java.util.List;

public class CargoHandlingEventDTO {

    private CargoDTO cargo;

    private List<HandlingEventDTO> events;

    public CargoDTO getCargo() {
        return cargo;
    }

    public void setCargo(CargoDTO cargo) {
        this.cargo = cargo;
    }

    public List<HandlingEventDTO> getEvents() {
        return events;
    }

    public void setEvents(List<HandlingEventDTO> events) {
        this.events = events;
    }

}
