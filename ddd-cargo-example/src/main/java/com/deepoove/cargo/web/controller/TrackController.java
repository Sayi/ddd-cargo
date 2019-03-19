package com.deepoove.cargo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.deepoove.cargo.application.query.TrackQueryService;

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
