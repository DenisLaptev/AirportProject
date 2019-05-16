package com.mvc_project.airport.exceptions;

public class MyMainMenuException extends Exception {
    public MyMainMenuException(){
        System.err.println("MyMenuException:You entered incorrect option");
    }
}
