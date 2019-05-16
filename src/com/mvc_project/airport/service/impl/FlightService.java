package com.mvc_project.airport.service.impl;

import com.mvc_project.airport.dao.impl.FlightDAO;
import com.mvc_project.airport.model.Flight;
import com.mvc_project.airport.service.interfaces.FlightServiceInterface;

import java.util.List;

public class FlightService implements FlightServiceInterface {

    FlightDAO flightDAO = new FlightDAO();

   @Override
    public void showListOfFlights(List<Flight> flights){
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
    @Override
    public void showFlightsByDate(String date){
        List<Flight> allFlights = flightDAO.getAllFlights();
        for (Flight flight : allFlights) {
            if(flight.getDate().equals(date)) {
                System.out.println(flight);
            }
        }
    }


}
