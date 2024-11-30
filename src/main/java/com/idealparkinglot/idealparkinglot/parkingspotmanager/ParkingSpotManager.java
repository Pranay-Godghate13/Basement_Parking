package com.idealparkinglot.idealparkinglot.parkingspotmanager;

import java.util.ArrayList;
import java.util.List;

import com.idealparkinglot.idealparkinglot.ParkingSpot.ParkingSpot;
import com.idealparkinglot.idealparkinglot.vehicle.Vehicle;

public class ParkingSpotManager {
    int number;
    String vehicle;
    ParkingSpot totalSpots[]=new ParkingSpot[10];
    public ParkingSpotManager(int number,String vehicle)
    {
        this.number=number;
        this.vehicle=vehicle;
    }
    public boolean isParkingAvailable()
    {
        if(vehicle=="Two")
        {
            for(int i=0;i<number;i++)
            {
                if(totalSpots[i]==null)
                return true;
            }
        }
        else
        {
            for(int i=number-1;i<10;i++)
            {
                if(totalSpots[i]==null)
                return true;
            }
        }
        return false;
    }
    public int parkingSpotId()
    {
        if(isParkingAvailable())
        {
            if(vehicle=="Two")
            {
                for(int i=0;i<number;i++)
                {
                    if(totalSpots[i]==null)
                    return i;
                }
            }
        }
        else
        {
            for(int i=number-1;i<10;i++)
                {
                    if(totalSpots[i]==null)
                    return i;
                }
        }
        return -1;

    }
    
}
