package com.idealparkinglot.idealparkinglot.ParkingSpot;

import com.idealparkinglot.idealparkinglot.vehicle.Vehicle;

public class ParkingSpot {
    int id;
    Vehicle vehicle;
    double price;
    boolean isEmpty;
    public ParkingSpot(int id)
    {
        this.id=id;
    }
    public ParkingSpot(double price)
    {
        this.price=price;
    }
    public void parkVehicle(Vehicle vehicle)
    {
        this.vehicle=vehicle;
        isEmpty=false;
    } 
    public void unparkVehicle()
    {
        this.vehicle=null;
        isEmpty=true;
    }

}
