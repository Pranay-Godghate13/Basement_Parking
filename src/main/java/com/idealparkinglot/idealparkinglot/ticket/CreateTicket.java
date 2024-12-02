package com.idealparkinglot.idealparkinglot.ticket;

import com.idealparkinglot.idealparkinglot.vehicle.Vehicle;

public class CreateTicket extends Ticket {
    String id;
    int spot;
    Vehicle vehicle;
    public CreateTicket(String id,int spot,Vehicle vehicle)
    {
        this.id=id;
        this.spot=spot;
        this.vehicle=vehicle;
    }
    @Override
    public void createTicket(String id,int spot,Vehicle vehicle) {
        System.out.println("The parking spot is "+spot);
    }
    
}
