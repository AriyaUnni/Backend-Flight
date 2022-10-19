package com.nestdigital.flightbackendApplication.controller;

import com.nestdigital.flightbackendApplication.dao.FlightDao;
import com.nestdigital.flightbackendApplication.model.FlightModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private FlightDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addflight",consumes = "application/json",produces = "application/json")
    public String addFlight(@RequestBody FlightModel flight){
        System.out.println(flight.toString());
        dao.save(flight);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewflight")
    public List<FlightModel> viewFlights(){
        return (List<FlightModel>) dao.findAll();
    }
}
