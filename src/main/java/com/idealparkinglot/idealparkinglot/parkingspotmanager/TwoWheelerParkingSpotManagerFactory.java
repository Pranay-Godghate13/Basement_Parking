package com.idealparkinglot.idealparkinglot.parkingspotmanager;

import com.idealparkinglot.idealparkinglot.parkingSpot.ParkingSpot;

public class TwoWheelerParkingSpotManagerFactory implements ParkingSpotManagerFactory {

    @Override
    public ParkingSpotManager creatSpotManager(ParkingSpot twoWheelerParkingSpot[]) {
        return new TwoWheelerSpotManager(twoWheelerParkingSpot);
    }
    
}
