package com.deepoove.cargo.domain.aggregate.cargo;

import java.util.Random;

import com.deepoove.cargo.domain.aggregate.cargo.valueobject.DeliverySpecification;

public class Cargo {

    private String id;
    private String senderId;
    private String description;
    private DeliverySpecification delivery;

    public Cargo(String id) {
        this.id = id;
    }

    /**
     * Factory method：预订新的货物
     * 
     * @param senderId
     * @param description
     * @param delivery
     * @return
     */
    public static Cargo newCargo(String senderId, String description,
            DeliverySpecification delivery) {
        String id = nextCargoId();
        Cargo cargo = new Cargo(id);
        cargo.senderId = senderId;
        cargo.description = description;
        cargo.delivery = delivery;
        return cargo;
    }

    /**
     * 货物物流id生成规则
     * 
     * @return
     */
    private static String nextCargoId() {
        return "CARGO-NO-" + (10000 + new Random().nextInt(9999));
    }

    public String id() {
        return id;
    }
    
    public String sender() {
        return senderId;
    }

}
