package com.idealparkinglot.idealparkinglot.vehicle;

public class FourWheeler extends Vehicle {
    int id;
    String type;
    public FourWheeler(int id)
    {
        this.id=id;
        this.type="Four Wheeler";
    }
    @Override
    public void vehicleDetail() {
        System.out.println("Vehicle is "+type+" and id is "+this.id);
    }
    @Override
    public String getType() {
       return type;
    }
    
}
