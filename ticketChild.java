package com.example.myapplication32;

public class ticketChild  extends tickets{
    private float ticketDiscount;
    public ticketChild (){
    }
    public ticketChild (float ticketPrice,int numberOfTickets,float ticketDiscount){
        super (ticketPrice, numberOfTickets);
        this.ticketDiscount =ticketDiscount;

    }
    public float ticketPriceAll(){
        return (getTicketPrice()*getNumberOfTickets() *(100-ticketDiscount))/100;
    }

}

