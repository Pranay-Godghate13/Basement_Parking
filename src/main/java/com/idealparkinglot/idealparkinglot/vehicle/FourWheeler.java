package com.idealparkinglot.idealparkinglot.vehicle;

public class FourWheeler extends Vehicle {
    int id;
    String type="FourWheeler";
    public FourWheeler(int id)
    {
        this.id=id;
        
    }
    @Override
    public void vehicleDetail() {
        System.out.println("Vehicle is "+type+" and id is "+this.id);
    }
    
}
