package com.deepoove.cargo.application.command.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.deepoove.cargo.application.command.CargoCmdService;
import com.deepoove.cargo.application.command.cmd.CargoBookCommand;
import com.deepoove.cargo.application.command.cmd.CargoDeleteCommand;
import com.deepoove.cargo.application.command.cmd.CargoDeliveryUpdateCommand;
import com.deepoove.cargo.domain.aggregate.cargo.Cargo;
import com.deepoove.cargo.domain.aggregate.cargo.CargoRepository;
import com.deepoove.cargo.domain.aggregate.cargo.valueobject.DeliverySpecification;
import com.deepoove.cargo.domain.aggregate.handlingevent.HandlingEvent;
import com.deepoove.cargo.domain.aggregate.handlingevent.HandlingEventRepository;

@Service
public class CargoCmdServiceImpl implements CargoCmdService {

    @Autowired
    private CargoRepository cargoRepository;
    @Autowired
    private HandlingEventRepository handlingEventRepository;

    @Override
    public void bookCargo(CargoBookCommand cargoBookCommand) {
        // validate
        int size = cargoRepository.sizeByCustomer(cargoBookCommand.getSenderId());
        
        if (!Cargo.canBook(size)) {
            return;
        }
        
        // create Cargo
        DeliverySpecification delivery = new DeliverySpecification(
                cargoBookCommand.getOriginLocationCode(),
                cargoBookCommand.getDestinationLocationCode());
        

        Cargo cargo = Cargo.newCargo(cargoBookCommand.getSenderId(),
                cargoBookCommand.getDescription(), delivery);

        // saveCargo
        cargoRepository.save(cargo);
    }

    @Override
    public void updateCargoDelivery(CargoDeliveryUpdateCommand cmd) {
        // validate
        
        // find
        Cargo cargo = cargoRepository.find(cmd.getCargoId());
        List<HandlingEvent> events = handlingEventRepository.findByCargo(cmd.getCargoId());
        
        // 流程编排
        if (CollectionUtils.isEmpty(events) || events.get(0).canModifyCargo()) {
            cargo.changeDelivery(cmd.getOriginLocationCode(), cmd.getDestinationLocationCode());
        }
        
        // save
        cargoRepository.save(cargo);
    }

    @Override
    public void deleteCargo(CargoDeleteCommand cmd) {
        cargoRepository.remove(cmd.getCargoId());
    }

}
