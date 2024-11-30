package com.idealparkinglot.idealparkinglot.vehicle;

public class TwoWheelerFactory implements VehicleFactory {
    
    @Override
    public Vehicle createVehicle(int id, String name) {
        return new TwoWheeler(id,name);    
    }
    
}
