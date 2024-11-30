package com.idealparkinglot.idealparkinglot.vehicle;

public class TwoWheeler extends Vehicle {
    int id;
    String name;
    public TwoWheeler(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    @Override
    public void vehicleDetail() {
        System.out.println("Vehicle is "+this.name+" and id is "+this.id);
    }
    
}
