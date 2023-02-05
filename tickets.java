package com.example.myapplication32;

public class tickets {
    private String departurePoint;
    private String arrivalPoint;
    private String departureDate;
    private String arrivalDate;
    private String travelTime;
    private int distance;
    private float ticketPrice;
    private int numberOfTickets;


    public tickets() {

    }

    public tickets(float ticketPrice, int numberOfTickets) {


        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public float ticketPriceAll() {
        return ticketPrice * numberOfTickets;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float TicketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public float getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(float NumberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}

