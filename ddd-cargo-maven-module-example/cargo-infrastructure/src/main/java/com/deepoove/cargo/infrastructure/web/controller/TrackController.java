package com.deepoove.cargo.infrastructure.web.controller;

import java.util.List;

import org.deepoove.cargo.query.service.TrackQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/track")
public class TrackController {
    
    @Autowired
    private TrackQueryService trackQueryService;

//    @RequestMapping(value = "/{cargoId}", method = RequestMethod.GET)
//    public List<HistoryDTO> query(@PathVariable String cargoId) {
//        
//        
//        
//        return "Hello, World";
//    }

}
