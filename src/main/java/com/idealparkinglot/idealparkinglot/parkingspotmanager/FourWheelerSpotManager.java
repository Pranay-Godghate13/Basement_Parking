package com.idealparkinglot.idealparkinglot.parkingspotmanager;


import com.idealparkinglot.idealparkinglot.parkingSpot.ParkingSpot;

public class FourWheelerSpotManager extends ParkingSpotManager {
    static ParkingSpot fourWheelerSpot[]=new ParkingSpot[10];
        public FourWheelerSpotManager()
        {
            super(fourWheelerSpot);
    }
}
