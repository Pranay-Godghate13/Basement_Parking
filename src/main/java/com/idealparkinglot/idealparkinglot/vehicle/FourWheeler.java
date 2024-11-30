package com.idealparkinglot.idealparkinglot.vehicle;

public class FourWheeler extends Vehicle {
    int id;
    String name;
    public FourWheeler(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    @Override
    public void vehicleDetail() {
        System.out.println("Vehicle is "+this.name+" and id is "+this.id);
    }
    
}
