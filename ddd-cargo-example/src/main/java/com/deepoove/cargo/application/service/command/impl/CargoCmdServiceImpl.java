package com.deepoove.cargo.application.service.command.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.deepoove.cargo.application.cmd.CargoBookCommand;
import com.deepoove.cargo.application.service.command.CargoCmdService;
import com.deepoove.cargo.domain.aggregate.cargo.Cargo;
import com.deepoove.cargo.domain.aggregate.cargo.CargoRepository;
import com.deepoove.cargo.domain.aggregate.cargo.valueobject.DeliverySpecification;

public class CargoCmdServiceImpl implements CargoCmdService {

    @Autowired
    private CargoRepository cargoRepository;

    @Override
    public void bookCargo(CargoBookCommand cargoBookCommand) {
        // create Cargo
        DeliverySpecification delivery = new DeliverySpecification(
                cargoBookCommand.getOriginLocationCode(),
                cargoBookCommand.getDestinationLocationCode());

        Cargo cargo = Cargo.newCargo(cargoBookCommand.getSenderId(),
                cargoBookCommand.getDescription(), delivery);

        // saveCargo
        cargoRepository.save(cargo);
    }

}
