package com.example.myapplication32;

public class ticketPensioner extends tickets {
    private float ticketDiscount;

    public ticketPensioner() {

    }

    public ticketPensioner(float ticketPrice, int numberOfTicket, float ticketDiscount) {
        super (ticketPrice, numberOfTicket);
        this.ticketDiscount = ticketDiscount;
    }

    public float ticketPriceAll() {
        return (getTicketPrice ( ) * getNumberOfTickets ( ) * (100 - ticketDiscount)) / 100;
    }

}