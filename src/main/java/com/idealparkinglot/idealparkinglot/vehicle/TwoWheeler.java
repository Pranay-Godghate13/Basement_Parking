package com.idealparkinglot.idealparkinglot.vehicle;

public class TwoWheeler extends Vehicle {
    int id;
    String type="TwoWheeler";
    public TwoWheeler(int id)
    {
        this.id=id;
        
    }
    @Override
    public void vehicleDetail() {
        System.out.println("Vehicle is "+type+" and id is "+this.id);
    }
    
}
