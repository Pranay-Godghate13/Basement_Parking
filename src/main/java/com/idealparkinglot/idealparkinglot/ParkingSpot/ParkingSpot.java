package com.idealparkinglot.idealparkinglot.parkingSpot;

import com.idealparkinglot.idealparkinglot.vehicle.Vehicle;

public class ParkingSpot {
    private int id;
    Vehicle vehicle;
    double price;
    private boolean isEmpty=true;
    
    public ParkingSpot(double price)
    {
        this.price=price;
    }
    public void parkVehicle(Vehicle vehicle)
    {
        this.vehicle=vehicle;
        setIsEmpty(false);
    } 
    public void unparkVehicle()
    {
        this.vehicle=null;
        setIsEmpty(true);
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public void setIsEmpty(boolean isEmpty)
    {
        this.isEmpty=isEmpty;
    }
    public boolean getIsEmpty()
    {
        return isEmpty;
    }

}
