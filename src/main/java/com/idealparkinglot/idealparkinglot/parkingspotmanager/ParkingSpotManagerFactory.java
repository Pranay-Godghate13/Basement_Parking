package com.idealparkinglot.idealparkinglot.parkingspotmanager;

import com.idealparkinglot.idealparkinglot.parkingSpot.ParkingSpot;

public interface ParkingSpotManagerFactory {
   public ParkingSpotManager creatSpotManager(ParkingSpot twoWheelerParkingSpot[]); 
}
