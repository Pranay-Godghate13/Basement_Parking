package com.idealparkinglot.idealparkinglot.parkingspotmanager;

import java.util.ArrayList;
import java.util.List;

import com.idealparkinglot.idealparkinglot.ParkingSpot.ParkingSpot;

public class FourWheelerSpotManager extends ParkingSpotManager {
    static ParkingSpot fourWheelerSpot[]=new ParkingSpot[10];
        public FourWheelerSpotManager()
        {
            super(fourWheelerSpot);
    }
}
