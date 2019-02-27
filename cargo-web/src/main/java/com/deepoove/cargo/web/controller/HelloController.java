package com.deepoove.cargo.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hello() {
        return "Hello, World";
    }

}
