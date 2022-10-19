package com.nestdigital.flightbackendApplication.dao;

import com.nestdigital.flightbackendApplication.model.FlightModel;
import org.springframework.data.repository.CrudRepository;

public interface FlightDao extends CrudRepository<FlightModel,Integer> {
}
