package com.idealparkinglot.idealparkinglot.parkingspotmanager;

import com.idealparkinglot.idealparkinglot.parkingSpot.ParkingSpot;

public class FourWheelerParkingSpotManagerFactory implements ParkingSpotManagerFactory {

    @Override
    public ParkingSpotManager creatSpotManager(ParkingSpot fourWheelerParkingSpot[]) {
        return new FourWheelerSpotManager(fourWheelerParkingSpot);
    }
    
}
