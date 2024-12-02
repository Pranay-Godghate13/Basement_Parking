package com.idealparkinglot.idealparkinglot.parkingspotmanager;

public class TwoWheelerParkingSpotManagerFactory implements ParkingSpotManagerFactory {

    @Override
    public ParkingSpotManager creatSpotManager() {
        return new TwoWheelerSpotManager();
    }
    
}
