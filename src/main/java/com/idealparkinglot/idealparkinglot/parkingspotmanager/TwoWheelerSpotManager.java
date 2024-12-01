package com.idealparkinglot.idealparkinglot.parkingspotmanager;

import java.util.ArrayList;
import java.util.List;

import com.idealparkinglot.idealparkinglot.ParkingSpot.ParkingSpot;

public class TwoWheelerSpotManager extends ParkingSpotManager{
    static ParkingSpot twoWheelerParkingSpot[]=new ParkingSpot[5];
    public TwoWheelerSpotManager()
    {
        super(twoWheelerParkingSpot);
    }
}
