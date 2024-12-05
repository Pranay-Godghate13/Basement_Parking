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
    private ParkingSpot twoWheeler[];
    private ParkingSpot fourWheeler[];
    TicketManager ticketManager;
   /*  public EntranceGateManager(Vehicle vehicle,ParkingSpotManagerFactory parkingSpotManagerFactory)
    {
        this.vehicle=vehicle;
        this.parkingSpotManager=parkingSpotManagerFactory.creatSpotManager();
    }*/
    public EntranceGateManager(ParkingSpot twoWheeler[],ParkingSpot fourWheeler[])
    {
        setTwoWheeler(twoWheeler);
        setFourWheeler(fourWheeler);
        
    }
    public void setTwoWheeler(ParkingSpot twoWheeler[])
    {
        this.twoWheeler=twoWheeler;
    }
    public ParkingSpot[] getTwoWheeler()
    {
        return twoWheeler;
    }
    public void setFourWheeler(ParkingSpot fourWheeler[])
    {
        this.fourWheeler=fourWheeler;
    }
    public ParkingSpot[] getFourWheeler()
    {
        return fourWheeler;
    }
    public void setVehicle(Vehicle vehicle)
    {
        this.vehicle=vehicle;
        switch (vehicle.getType()) {
            case "Two Wheeler":
                setParkingSpotManager(new TwoWheelerSpotManager(getTwoWheeler()));
                break;
            case "Four Wheeler":
                setParkingSpotManager(new FourWheelerSpotManager(getFourWheeler()));
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
    
}
