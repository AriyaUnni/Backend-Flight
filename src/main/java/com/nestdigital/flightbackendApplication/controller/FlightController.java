package com.nestdigital.flightbackendApplication.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

    @PostMapping("/addflight")
    public String addFlight(){
        return "test";
    }
}
