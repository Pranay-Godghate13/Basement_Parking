package com.idealparkinglot.idealparkinglot;

import com.idealparkinglot.idealparkinglot.vehicle.Vehicle;
import com.idealparkinglot.idealparkinglot.vehicle.VehicleFactory;

public class Person {
    private Vehicle vehicle;
    public Person(VehicleFactory vehicleFactory,int id,String name)
    {
        vehicle=vehicleFactory.createVehicle(id);
    }
    public Vehicle getVehicle()
    {
        return vehicle;
    }
}
