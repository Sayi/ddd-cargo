package com.deepoove.cargo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deepoove.cargo.application.command.CargoCmdService;
import com.deepoove.cargo.application.command.cmd.CargoBookCommand;
import com.deepoove.cargo.application.command.cmd.CargoDeleteCommand;
import com.deepoove.cargo.application.command.cmd.CargoDeliveryUpdateCommand;
import com.deepoove.cargo.application.command.cmd.CargoSenderUpdateCommand;
import com.deepoove.cargo.application.query.CargoQueryService;
import com.deepoove.cargo.application.query.dto.CargoDTO;
import com.deepoove.cargo.application.query.qry.CargoFindbyCustomerQry;

@RestController
@RequestMapping("/cargo")
public class CargoController {

    @Autowired
    CargoQueryService cargoQueryService;
    @Autowired
    CargoCmdService cargoCmdService;

    @RequestMapping(method = RequestMethod.GET)
    public List<CargoDTO> queryCargos(
            @RequestParam(value = "phone", required = false) String phone) {
        if (!StringUtils.isEmpty(phone)) {
            CargoFindbyCustomerQry qry = new CargoFindbyCustomerQry();
            qry.setCustomerPhone(phone);
            return cargoQueryService.queryCargos(qry);
        }
        return cargoQueryService.queryCargos();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void book(@RequestBody CargoBookCommand cargoBookCommand) {
        cargoCmdService.bookCargo(cargoBookCommand);
    }

    @RequestMapping(value = "/{cargoId}/delivery", method = RequestMethod.PUT)
    public void modifydestinationLocationCode(@PathVariable String cargoId,
            @RequestBody CargoDeliveryUpdateCommand cmd) {
        cmd.setCargoId(cargoId);
        cargoCmdService.updateCargoDelivery(cmd);
    }
    @RequestMapping(value = "/{cargoId}/sender", method = RequestMethod.PUT)
    public void modifySender(@PathVariable String cargoId,
            @RequestBody CargoSenderUpdateCommand cmd) {
        cmd.setCargoId(cargoId);
        cargoCmdService.updateCargoSender(cmd);
    }

    @RequestMapping(value = "/{cargoId}", method = RequestMethod.DELETE)
    public void remoeCargo(@PathVariable String cargoId) {
        CargoDeleteCommand cmd = new CargoDeleteCommand();
        cmd.setCargoId(cargoId);
        cargoCmdService.deleteCargo(cmd);
    }

}
