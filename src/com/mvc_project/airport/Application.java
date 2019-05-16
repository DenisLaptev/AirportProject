package com.mvc_project.airport;

import com.mvc_project.airport.controller.MenuController;
import com.mvc_project.airport.view.MainMenu;

import java.io.File;
import java.util.Scanner;

import static com.mvc_project.airport.resources.AddressesOfDBTables.ADDRESS_OF_FLIGHTS_TABLE_FILE;
import static com.mvc_project.airport.utils.FlightsGenerator.createFlightsFile;

public class Application {

    public static boolean isFlightsFileCreated = false;

    public Application() {

        try {
            if(isFlightsFileCreated == false) {
                createFlightsFile(new File(ADDRESS_OF_FLIGHTS_TABLE_FILE));
                isFlightsFileCreated = true;
            }

            Scanner scanner = new Scanner(System.in);
            MainMenu.displayMenu();
            int position = scanner.nextInt();

            MenuController controller = new MenuController();
            controller.makeAction(position);

            MainMenu.continueExitQuestion();
        } catch (Exception e) {
            e.getMessage();
        }
    }


    public static void main(String[] args) {
        new Application();
    }



}
