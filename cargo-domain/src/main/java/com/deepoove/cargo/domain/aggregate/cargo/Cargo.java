package com.deepoove.cargo.domain.aggregate.cargo;

public class Cargo {

    private String id;

    private String customerId;

    private DeliveryHistory deliveryHistory;
    
    public Cargo(String id) {
        this.id = id;
        deliveryHistory = new DeliveryHistory(this);
    }

}
