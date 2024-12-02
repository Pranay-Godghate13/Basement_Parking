package com.idealparkinglot.idealparkinglot.vehicle;

public class FourWheelerFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle(int id) {
        return new FourWheeler(id);
    }
    
}
