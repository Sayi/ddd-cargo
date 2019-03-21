package com.deepoove.cargo.domain.aggregate.cargo;

import java.util.Random;

import com.deepoove.cargo.domain.aggregate.cargo.valueobject.DeliverySpecification;

public class Cargo {

    private String id;
    private String senderPhone;
    private String description;
    private DeliverySpecification delivery;

    public Cargo(String id) {
        this.id = id;
    }

    public Cargo() {}

    /**
     * Factory method：预订新的货物
     * 
     * @param senderId
     * @param description
     * @param delivery
     * @return
     */
    public static Cargo newCargo(String senderPhone, String description,
            DeliverySpecification delivery) {
        String id = nextCargoId();
        Cargo cargo = new Cargo(id);
        cargo.senderPhone = senderPhone;
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
        return senderPhone;
    }

    public String description() {
        return description;
    }

    public DeliverySpecification delivery() {
        return delivery;
    }

    public void setDelivery(DeliverySpecification delivery) {
        this.delivery = delivery;
    }

    public void changeDelivery(String destinationLocationCode) {
        if (this.delivery
                .getOriginLocationCode() == destinationLocationCode) { throw new IllegalArgumentException(
                        "destination and origin location cannot be the same."); }
        this.delivery.setDestinationLocationCode(destinationLocationCode);
    }

    public void changeSender(String senderPhone) {
        this.senderPhone = senderPhone;
    }

}
