package com.mvc_project.airport.utils;

import com.mvc_project.airport.model.Flight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkWithDBFiles {

    public static String makeStringFromFile(File file) throws IOException {

        String resultText = "";

        StringBuilder sb = new StringBuilder("");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            sb.append(st).append("\n");
        }

        resultText = String.valueOf(sb);
        return resultText;
    }


    public static List<Flight> makeListOfFlightsFromString(String string) {
        List<Flight> allFlights = new ArrayList<>();

        String[] lines = string.split("\n");
        for (int i = 0; i < lines.length; i++) {
            Flight flight;

            String[] words = lines[i].split("\t");

            flight = new Flight(Long.parseLong(words[0]), words[1], words[2], words[3], Integer.parseInt(words[4]));
            allFlights.add(flight);
        }
        return allFlights;
    }

    public static List<Flight> makeListOfFlightsFromFile(File file) throws IOException {

        String stringContentOfFile = makeStringFromFile(file);
        List<Flight> allFlights = makeListOfFlightsFromString(stringContentOfFile);

        return allFlights;
    }
}
