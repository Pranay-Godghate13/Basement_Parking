package com.idealparkinglot.idealparkinglot.entrance;

import com.idealparkinglot.idealparkinglot.parkingspotmanager.ParkingSpotManager;
import com.idealparkinglot.idealparkinglot.parkingspotmanager.ParkingSpotManagerFactory;
import com.idealparkinglot.idealparkinglot.vehicle.Vehicle;

public class EntranceGateManager {
    Vehicle vehicle;
    ParkingSpotManager parkingSpotManager;
    public EntranceGateManager(Vehicle vehicle,ParkingSpotManagerFactory parkingSpotManagerFactory)
    {
        this.vehicle=vehicle;
        this.parkingSpotManager=parkingSpotManagerFactory.creatSpotManager();
    }
}
