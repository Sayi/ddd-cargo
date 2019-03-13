package com.deepoove.cargo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deepoove.cargo.domain.aggregate.cargo.CargoRepository;

@RestController
public class BookingController {
    
    @Autowired
    CargoRepository cargoRepository;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hello() {
        cargoRepository.find("");
        return "Hello, World";
    }

}
