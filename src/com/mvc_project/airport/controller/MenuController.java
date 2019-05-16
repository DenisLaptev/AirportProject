package com.mvc_project.airport.controller;


import com.mvc_project.airport.exceptions.MyMainMenuException;
import com.mvc_project.airport.service.impl.BookingService;
import com.mvc_project.airport.service.impl.FlightService;
import com.mvc_project.airport.service.impl.PassengerService;
import com.mvc_project.airport.utils.WorkWithDate;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MenuController {
    public void makeAction(int position) throws MyMainMenuException {
        FlightService flightService = new FlightService();
        PassengerService passengerService = new PassengerService();
        BookingService bookingService = new BookingService();


        switch (position) {
            case 1:
                System.out.println();
                System.out.println("Вы выбрали 1) Онлайн-табло");
                System.out.println();

                String currentDate = WorkWithDate.obtainCurrentDateString();

                System.out.println("Сегодняшняя дата: " + currentDate);

                flightService.showFlightsByDate(currentDate);
                break;



            case 2:
                System.out.println();
                System.out.println("Вы выбрали 2) Посмотреть информацию о рейсе");
                System.out.println();
/*
                long flightId = enterId("Введите id рейса:");
                flightService.showFlightById(flightId);*/
                break;

            case 3:
                System.out.println();
                System.out.println("Вы выбрали 3) Поиск и бронировка рейса");
                System.out.println();
/*
                BookingRequest bookingRequest = prepareBookingRequest();

                System.out.println("You are making a booking request:\n" + bookingRequest);

                List<Flight> requestedFlights = flightService.findRequestedFlights(bookingRequest);

                if (requestedFlights.size() > 0) {
                    System.out.println("Requested list of Flights:");
                    flightService.showListOfFlights(requestedFlights);
                } else {
                    System.out.println("No such flights found");
                }
                List<Passenger> passengers = new ArrayList<>();

                if (requestedFlights.size() > 0) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Введите номер рейса для бронирования или нажмите 0 для выхода");
                    long idOfBookingFlight = scanner.nextLong();
                    if (idOfBookingFlight == 0) {
                        break;
                    } else {
                        System.out.println("Вы ввели id рейса: " + idOfBookingFlight);

                        for (int i = 0; i < bookingRequest.getNumberOfPassengers(); i++) {

                            //Passenger passenger;
                            System.out.println("Введите имя (First name) пассажира" + (i + 1));
                            String name = scanner.next();

                            System.out.println("Введите фамилию (Last name) пассажира" + (i + 1));
                            String surname = scanner.next();


                            Passenger passenger = new Passenger(idsService.generatePassengerId(), name, surname);
                            passengers.add(passenger);
                        }
                        bookingRequest.setFlightId(idOfBookingFlight);
                        bookingRequest.setListOfPassengers(passengers);
                    }
                }

                passengerService.addAllPassengers(passengers);
                bookingService.addAllBookings(bookingRequest);

                System.out.println("Билеты забронированы! Благодарим Вас!");
*/
                break;

            case 4:
                System.out.println();
                System.out.println("Вы выбрали 4) Отменить бронирование");
                System.out.println();
/*
                long bookingId = enterId("Введите id бронирования:");
                Booking bookingForCancel = bookingService.getBookingById(bookingId);

                System.out.println("bookingForCancel="+bookingForCancel);
                if (bookingForCancel != null) {


                    System.out.println("Bookings before deleting:");
                    List<Booking> bookings = bookingService.getAllBookings();
                    for (Booking booking : bookings) {
                        System.out.println(booking);
                    }

                    System.out.println("Данное бронирование отменено:");
                    System.out.println(bookingForCancel);


                    bookingService.deleteBookingById(bookingId);

                    System.out.println("Bookings after deleting:");
                    List<Booking> bookings2 = bookingService.getAllBookings();
                    for (Booking booking : bookings2) {
                        System.out.println(booking);
                    }

                } else {
                    System.out.println("Нет такого бронирования");
                }*/

                break;

            case 5:
                System.out.println();
                System.out.println("Вы выбрали 5) Мои рейсы");
                System.out.println();
/*

                Scanner scanner = new Scanner(System.in);

                System.out.println("Введите имя (First name) пассажира: ");
                String name = scanner.next();

                System.out.println("Введите фамилию (Last name) пассажира: ");
                String surname = scanner.next();


                Passenger passengerRequested = new Passenger(name, surname);
                long passengerRequestedId = passengerService.getIdOfThePassenger(passengerRequested);
                passengerRequested.setId(passengerRequestedId);

                System.out.println("You are looking for the booking flights of this passenger:");
                System.out.println(passengerRequested);

                List<Booking> bookingsOfPassenger = bookingService.getAllBookingsByPassengerId(passengerRequestedId);

                System.out.println("MenuController:bookingsOfPassenger:");
                for (Booking booking : bookingsOfPassenger) {
                    System.out.println(bookingsOfPassenger);
                }

                if (bookingsOfPassenger.size() != 0) {
                    for (Booking booking : bookingsOfPassenger) {
                        System.out.println(booking);
                    }
                } else {
                    System.out.println("There are no bookings");
                }
*/
                break;

            case 6:
                System.out.println();
                System.out.println("Вы выбрали 6) Выход");
                System.out.println();
                break;
            default:
                throw new MyMainMenuException();


        }
    }

    /*private BookingRequest prepareBookingRequest() {

        long id = 100;
        String date;
        String destination;
        int numberOfPassengers;
        //long flightId = -1;
        List<Passenger> listOfPassengers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите место назначения рейса");
        destination = scanner.nextLine();

        System.out.println("Введите дату рейса в форамате dd.mm.yyyy");
        date = scanner.nextLine();

        System.out.println("Введите количество необходимых билетов");
        numberOfPassengers = scanner.nextInt();

        BookingRequest bookingRequest = new BookingRequest(id, date, destination, numberOfPassengers, -1, listOfPassengers);

        return bookingRequest;
    }*/

    /*private String enterDate(String massageForUser) {
        System.out.println(massageForUser);

        Scanner scanner = new Scanner(System.in);

        String date = scanner.nextLine();

        return date;
    }*/

    /*private long enterId(String massageForUser) {
        System.out.println(massageForUser);

        Scanner scanner = new Scanner(System.in);

        long id = scanner.nextLong();

        return id;
    }*/
}
