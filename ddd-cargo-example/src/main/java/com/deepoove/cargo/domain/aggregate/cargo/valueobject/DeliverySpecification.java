package com.deepoove.cargo.domain.aggregate.cargo.valueobject;

public class DeliverySpecification {

    private String originLocationCode;
    private String destinationLocationCode;

    public DeliverySpecification(String originLocationCode, String destinationLocationCode) {
        this.originLocationCode = originLocationCode;
        this.destinationLocationCode = destinationLocationCode;
    }

    public String getOriginLocationCode() {
        return originLocationCode;
    }

    public void setOriginLocationCode(String originLocationCode) {
        this.originLocationCode = originLocationCode;
    }

    public String getDestinationLocationCode() {
        return destinationLocationCode;
    }

    public void setDestinationLocationCode(String destinationLocationCode) {
        this.destinationLocationCode = destinationLocationCode;
    }

}
