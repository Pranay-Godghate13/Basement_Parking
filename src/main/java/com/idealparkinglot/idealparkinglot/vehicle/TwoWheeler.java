package com.idealparkinglot.idealparkinglot.vehicle;

public class TwoWheeler extends Vehicle {
    int id;
    String type;
    public TwoWheeler(int id)
    {
        this.id=id;
        this.type="Two Wheeler";
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
