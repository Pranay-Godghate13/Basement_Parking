package com.idealparkinglot.idealparkinglot.parkingspotmanager;



import com.idealparkinglot.idealparkinglot.parkingSpot.ParkingSpot;
import com.idealparkinglot.idealparkinglot.vehicle.Vehicle;


public class ParkingSpotManager {
    private ParkingSpot parkingSpots[];
    public ParkingSpotManager(ParkingSpot parkingSpots[])
    {
        setParkingSpot(parkingSpots);
    }
    public void setParkingSpot(ParkingSpot parkingSpots[])
    {
        this.parkingSpots=parkingSpots;
    }
    public ParkingSpot[] geParkingSpot()
    {
        return parkingSpots;
    }
    public int findParkingSpace(Vehicle vehicle)
    {
        int len=parkingSpots.length;
        for(int i=0;i<len;i++)
        {
            if(parkingSpots[i].getIsEmpty()==true)
            {
                parkingSpots[i].parkVehicle(vehicle);
                return i+1;
            }
            
        }
        return -1;
    }
    

        
}
