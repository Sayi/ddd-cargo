package com.deepoove.cargo.application.command.cmd;

public class CargoSenderUpdateCommand {

    private String cargoId;

    private String senderPhone;

    public String getCargoId() {
        return cargoId;
    }

    public void setCargoId(String cargoId) {
        this.cargoId = cargoId;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

}
