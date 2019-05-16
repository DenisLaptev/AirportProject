package com.mvc_project.airport.service.interfaces;

import com.mvc_project.airport.model.Flight;

import java.util.List;

public interface FlightServiceInterface {

    void showListOfFlights(List<Flight> flights);

    void showFlightsByDate(String date);
}
