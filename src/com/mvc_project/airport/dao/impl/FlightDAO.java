package com.mvc_project.airport.dao.impl;

import com.mvc_project.airport.dao.interfaces.FlightDAOInterface;
import com.mvc_project.airport.model.Flight;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.mvc_project.airport.resources.AddressesOfDBTables.ADDRESS_OF_FLIGHTS_TABLE_FILE;
import static com.mvc_project.airport.utils.WorkWithDBFiles.makeListOfFlightsFromFile;

public class FlightDAO implements FlightDAOInterface {

    @Override
    public List<Flight> getAllFlights() {
        List<Flight> allFlights = new ArrayList<>();

        try {
            allFlights = makeListOfFlightsFromFile(new File(ADDRESS_OF_FLIGHTS_TABLE_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return allFlights;
    }
}
