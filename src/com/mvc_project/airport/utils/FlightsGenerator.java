package com.mvc_project.airport.utils;

import com.mvc_project.airport.exceptions.MyFileException;
import com.mvc_project.airport.model.Flight;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FlightsGenerator {

    public static final int NUMBER_OF_FLIGHTS = 10000;
    public static int MAXIMAL_NUMBER_OF_FREE_PLACES_IN_THE_FLIGHT = 20;

    public static long[] flightIds = new long[NUMBER_OF_FLIGHTS];

    public static String[] days = new String[]{
            "01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25", "26", "27", "28"
    };

    public static String[] months = new String[]{
            "01", "02", "03",
            "04", "05", "06",
            "07", "08", "09",
            "10", "11", "12"
    };

    public static String year = "2019";

    public static String[] times = new String[]{
            "12:00", "13:00", "14:00", "15:00", "16:00", "17:00",
            "18:00", "19:00", "20:00", "21:00", "22:00", "23:00",
            "00:00", "01:00", "02:00", "03:00", "04:00", "05:00",
            "06:00", "07:00", "08:00", "09:00", "10:00", "11:00",
    };

    public static String[] cities = new String[]{
            "Kharkov", "London", "Paris", "New York", "Milan", "Amsterdam",
            "Los Angeles", "Dubai", "Tokio", "Rome", "Brussels",
            "Vinnicia"
    };

    public static int[] freePlacesArray = new int[NUMBER_OF_FLIGHTS];


    public static List<Flight> generateListOfFlights() {

        for (int i = 0; i < NUMBER_OF_FLIGHTS; i++) {
            flightIds[i] = (i + 1);
            freePlacesArray[i] = rnd(MAXIMAL_NUMBER_OF_FREE_PLACES_IN_THE_FLIGHT);
        }

        List<Flight> flights = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_FLIGHTS; i++) {
            long flightId = flightIds[i];
            String date = days[rnd(days.length)] + "." + months[rnd(months.length)] + "." + year;
            String time = times[rnd(times.length)];
            String destination = cities[rnd(cities.length)];
            int freePlaces = freePlacesArray[i];

            Flight flight = new Flight(flightId, date, time, destination, freePlaces);
            flights.add(flight);
        }
        return flights;
    }

    public static int rnd(int max) {
        return (int) (Math.random() * max);
    }

    public static void createFlightsFile(File file) throws MyFileException {
        List<Flight> listOfFlights = generateListOfFlights();
        try (PrintWriter outputStream = new PrintWriter(new FileWriter(file, false))) {

            for (Flight flight : listOfFlights) {
                String row = flight.getId() + "\t"
                        + flight.getDate() + "\t"
                        + flight.getTime() + "\t"
                        + flight.getDestination() + "\t"
                        + flight.getFreePlaces();
                outputStream.println(row);

                outputStream.flush(); // сбрасывает буффер
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw new MyFileException();
        }
    }

    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();
        flights = generateListOfFlights();
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}
