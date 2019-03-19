package com.deepoove.cargo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deepoove.cargo.application.command.CargoCmdService;
import com.deepoove.cargo.application.command.cmd.CargoBookCommand;
import com.deepoove.cargo.application.query.CargoQueryService;
import com.deepoove.cargo.application.query.dto.CargoDTO;
import com.deepoove.cargo.domain.aggregate.cargo.CargoRepository;

@RestController
@RequestMapping("/cargo")
public class BookingController {
    
    @Autowired
    CargoRepository cargoRepository;
    
    @Autowired
    CargoQueryService cargoQueryService;
    @Autowired
    CargoCmdService cargoCmdService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String test() {
        cargoRepository.find("");
        return "Hello, DDD";
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<CargoDTO> queryCargos() {
        return cargoQueryService.queryCargos();
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public void book(@RequestBody CargoBookCommand cargoBookCommand) {
        cargoCmdService.bookCargo(cargoBookCommand);
    }

}
