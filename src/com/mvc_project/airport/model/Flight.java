package com.mvc_project.airport.model;

public class Flight {
    private long id;
    private String date;
    private String time;
    private String destination;
    private int freePlaces;

    public Flight() {
    }

    public Flight(long id, String date, String time, String destination, int freePlaces) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.destination = destination;
        this.freePlaces = freePlaces;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFreePlaces() {
        return freePlaces;
    }

    public void setFreePlaces(int freePlaces) {
        this.freePlaces = freePlaces;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", date=" + date +
                ", time=" + time +
                ", destination=" + destination +
                ", freePlaces=" + freePlaces +
                "}";
    }
}

