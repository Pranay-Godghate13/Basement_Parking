package com.idealparkinglot.idealparkinglot.parkingspotmanager;

public class FourWheelerParkingSpotManagerFactory implements ParkingSpotManagerFactory {

    @Override
    public ParkingSpotManager creatSpotManager() {
        return new FourWheelerSpotManager();
    }
    
}
