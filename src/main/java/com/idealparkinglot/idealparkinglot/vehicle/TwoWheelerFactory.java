package com.idealparkinglot.idealparkinglot.vehicle;

public class TwoWheelerFactory implements VehicleFactory {
    
    @Override
    public Vehicle createVehicle(int id) {
        return new TwoWheeler(id);    
    }
    
}
