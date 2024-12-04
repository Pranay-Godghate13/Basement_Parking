package com.idealparkinglot.idealparkinglot.entrance;

import org.apache.logging.log4j.util.Constants;

import com.idealparkinglot.idealparkinglot.parkingSpot.ParkingSpot;
import com.idealparkinglot.idealparkinglot.parkingspotmanager.FourWheelerSpotManager;
import com.idealparkinglot.idealparkinglot.parkingspotmanager.ParkingSpotManager;
import com.idealparkinglot.idealparkinglot.parkingspotmanager.ParkingSpotManagerFactory;
import com.idealparkinglot.idealparkinglot.parkingspotmanager.TwoWheelerSpotManager;
import com.idealparkinglot.idealparkinglot.ticket.CreateTicket;
import com.idealparkinglot.idealparkinglot.ticket.Ticket;
import com.idealparkinglot.idealparkinglot.vehicle.Vehicle;

public class EntranceGateManager {
    private Vehicle vehicle;
    private ParkingSpotManager parkingSpotManager;
    Ticket ticket;
    ParkingSpot twoWheeler[];
    ParkingSpot fourWheeler[];
   /*  public EntranceGateManager(Vehicle vehicle,ParkingSpotManagerFactory parkingSpotManagerFactory)
    {
        this.vehicle=vehicle;
        this.parkingSpotManager=parkingSpotManagerFactory.creatSpotManager();
    }*/
    public EntranceGateManager(ParkingSpot twoWheeler[],ParkingSpot fourWheeler[])
    {
        this.twoWheeler=twoWheeler;
        this.fourWheeler=fourWheeler;
    }
    public void setVehicle(Vehicle vehicle)
    {
        this.vehicle=vehicle;
        switch (vehicle.getType()) {
            case "Two Wheeler":
                setParkingSpotManager(new TwoWheelerSpotManager(twoWheeler));
                break;
            case "Four Wheeler":
                setParkingSpotManager(new FourWheelerSpotManager(fourWheeler));
                break;
            default:
                break;
        }
    }
    public Vehicle getVehicle()
    {
        return vehicle;
    }
    public void setParkingSpotManager(ParkingSpotManager parkingSpotManager)
    {
        this.parkingSpotManager=parkingSpotManager;
    }
    public ParkingSpotManager getParkingSpotManager()
    {
        return parkingSpotManager;
    }

    public int findParkingSpace()
    {
        int result=getParkingSpotManager().findParkingSpace(getVehicle());
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
