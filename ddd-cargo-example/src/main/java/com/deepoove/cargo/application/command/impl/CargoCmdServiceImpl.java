package com.deepoove.cargo.application.command.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepoove.cargo.application.command.CargoCmdService;
import com.deepoove.cargo.application.command.cmd.CargoBookCommand;
import com.deepoove.cargo.application.command.cmd.CargoDeleteCommand;
import com.deepoove.cargo.application.command.cmd.CargoDeliveryUpdateCommand;
import com.deepoove.cargo.application.command.cmd.CargoSenderUpdateCommand;
import com.deepoove.cargo.domain.aggregate.cargo.Cargo;
import com.deepoove.cargo.domain.aggregate.cargo.CargoRepository;
import com.deepoove.cargo.domain.aggregate.cargo.valueobject.DeliverySpecification;
import com.deepoove.cargo.domain.aggregate.handlingevent.HandlingEvent;
import com.deepoove.cargo.domain.aggregate.handlingevent.HandlingEventRepository;
import com.deepoove.cargo.domain.service.CargoDomainService;

@Service
public class CargoCmdServiceImpl implements CargoCmdService {

    @Autowired
    private CargoRepository cargoRepository;
    @Autowired
    private HandlingEventRepository handlingEventRepository;
    @Autowired
    private CargoDomainService cargoDomainService;

    @Override
    public void bookCargo(CargoBookCommand cargoBookCommand) {
        // 流程编排
        int size = cargoRepository.sizeByCustomer(cargoBookCommand.getSenderPhone());
        if (!cargoDomainService.canBook(size)) { throw new IllegalArgumentException(
                cargoBookCommand.getSenderPhone() + " cannot book cargo, exceed the limit: "
                        + CargoDomainService.MAX_CARGO_LIMIT); }

        // create Cargo
        DeliverySpecification delivery = new DeliverySpecification(
                cargoBookCommand.getOriginLocationCode(),
                cargoBookCommand.getDestinationLocationCode());

        Cargo cargo = Cargo.newCargo(cargoBookCommand.getSenderPhone(),
                cargoBookCommand.getDescription(), delivery);

        // saveCargo
        cargoRepository.save(cargo);
    }

    @Override
    public void updateCargoDelivery(CargoDeliveryUpdateCommand cmd) {
        // validate

        // find
        Cargo cargo = cargoRepository.find(cmd.getCargoId());

        // domain logic
        cargo.changeDelivery(cmd.getDestinationLocationCode());

        // save
        cargoRepository.save(cargo);
    }

    @Override
    public void updateCargoSender(CargoSenderUpdateCommand cmd) {

        // find
        Cargo cargo = cargoRepository.find(cmd.getCargoId());
        List<HandlingEvent> events = handlingEventRepository.findByCargo(cmd.getCargoId());

        // domain service
        cargoDomainService.updateCargoSender(cargo, cmd.getSenderPhone(), events.get(0));

        // save
        cargoRepository.save(cargo);
    }

    @Override
    public void deleteCargo(CargoDeleteCommand cmd) {
        cargoRepository.remove(cmd.getCargoId());
    }

}
