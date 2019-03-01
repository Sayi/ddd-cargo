package com.deepoove.cargo.domain.aggregate.cargo;

import java.util.List;

import com.deepoove.cargo.domain.aggregate.handlingevent.HandlingEvent;

@Deprecated
public class DeliveryHistory {
    
   

    private String id;
    
    private Cargo cargo;
    
    private List<HandlingEvent> handlingEvents;
    
    public DeliveryHistory(Cargo cargo) {
        this.cargo = cargo;
    }

}
