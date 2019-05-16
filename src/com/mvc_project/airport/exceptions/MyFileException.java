package com.mvc_project.airport.exceptions;

public class MyFileException extends Exception{
    public MyFileException() {
        System.err.println("MyFileException: Can not find current file");
    }
}
