package com.idealparkinglot.idealparkinglot.parkingspotmanager;



import com.idealparkinglot.idealparkinglot.parkingSpot.ParkingSpot;


public class ParkingSpotManager {
    ParkingSpot parkingSpots[];
    public ParkingSpotManager(ParkingSpot parkingSpots[])
    {
        this.parkingSpots=parkingSpots;
    }
    public int findParkingSpace()
    {
        int len=parkingSpots.length;
        for(int i=0;i<len;i++)
        {
            if(parkingSpots[i]!=null)
            return i;
        }
        return -1;
    }
    

        
}
