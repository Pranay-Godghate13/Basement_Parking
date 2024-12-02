package com.idealparkinglot.idealparkinglot.entrance;

import org.apache.logging.log4j.util.Constants;

import com.idealparkinglot.idealparkinglot.parkingspotmanager.ParkingSpotManager;
import com.idealparkinglot.idealparkinglot.parkingspotmanager.ParkingSpotManagerFactory;
import com.idealparkinglot.idealparkinglot.ticket.CreateTicket;
import com.idealparkinglot.idealparkinglot.ticket.Ticket;
import com.idealparkinglot.idealparkinglot.vehicle.Vehicle;

public class EntranceGateManager {
    Vehicle vehicle;
    ParkingSpotManager parkingSpotManager;
    Ticket ticket;
    public EntranceGateManager(Vehicle vehicle,ParkingSpotManagerFactory parkingSpotManagerFactory)
    {
        this.vehicle=vehicle;
        this.parkingSpotManager=parkingSpotManagerFactory.creatSpotManager();
    }
    public int findParkingSpace()
    {
        int result=parkingSpotManager.findParkingSpace();
        return result;
    }
    public void createTicket()
    {
        int spot=findParkingSpace();
        if(spot==-1)
        System.out.println("Sorry parking is full. Do visit again.");
        else
        {
            ticket=new CreateTicket("RHB", spot, vehicle);
            ticket.createTicket("RHB", spot, vehicle);
        }
    }

}
