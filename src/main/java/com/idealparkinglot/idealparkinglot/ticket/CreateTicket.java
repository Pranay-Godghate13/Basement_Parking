package com.idealparkinglot.idealparkinglot.ticket;

import java.time.LocalTime;

import com.idealparkinglot.idealparkinglot.vehicle.Vehicle;

public class CreateTicket extends Ticket {
    String id;
    int spot;
    Vehicle vehicle;
    LocalTime currTime;
    public CreateTicket(String id,int spot,Vehicle vehicle)
    {
        this.id=id;
        this.spot=spot;
        this.vehicle=vehicle;
    }
    @Override
    public void createTicket(String id,int spot,Vehicle vehicle) {
        setTime();
        System.out.println("Please park your "+ vehicle.getType()+" on spot "+spot+" Time parked "+getTime());
    }
    public void setTime()
    {
        this.currTime=LocalTime.now();
    }
    public LocalTime getTime()
    {
        return currTime;
    }
    
}
