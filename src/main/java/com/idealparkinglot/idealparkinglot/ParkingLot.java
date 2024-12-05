package com.idealparkinglot.idealparkinglot;

import com.idealparkinglot.idealparkinglot.entrance.EntranceGateManager;
import com.idealparkinglot.idealparkinglot.entrance.TicketManager;
import com.idealparkinglot.idealparkinglot.exitgate.ExitGateManager;
import com.idealparkinglot.idealparkinglot.parkingSpot.FourWheelerParkingSpot;
import com.idealparkinglot.idealparkinglot.parkingSpot.ParkingSpot;
import com.idealparkinglot.idealparkinglot.parkingSpot.TwoWheelerParkingSpot;
import com.idealparkinglot.idealparkinglot.parkingspotmanager.FourWheelerParkingSpotManagerFactory;
import com.idealparkinglot.idealparkinglot.parkingspotmanager.TwoWheelerParkingSpotManagerFactory;
import com.idealparkinglot.idealparkinglot.parkingspotmanager.TwoWheelerSpotManager;
import com.idealparkinglot.idealparkinglot.payment.Card;
//import com.idealparkinglot.idealparkinglot.vehicle.FourWheeler;
import com.idealparkinglot.idealparkinglot.vehicle.FourWheelerFactory;
//import com.idealparkinglot.idealparkinglot.vehicle.TwoWheeler;
import com.idealparkinglot.idealparkinglot.vehicle.TwoWheelerFactory;
import com.idealparkinglot.idealparkinglot.vehicle.Vehicle;
import com.idealparkinglot.idealparkinglot.vehicle.VehicleFactory;

public class ParkingLot {
    public static void main(String args[])
    {
        VehicleFactory twoWheelerFactory=new TwoWheelerFactory();
        VehicleFactory fourWheelerFactory=new FourWheelerFactory();
        
        //Creating  two and four wheeler spot for parking.
        //ParkingSpot twoWheelerParkingSpot=new TwoWheelerParkingSpot(10);
        //ParkingSpot fourWheelerParkingSpot=new FourWheelerParkingSpot(20);
        
        //Aloting parking spot for two wheeler and four wheeler vehicle
        ParkingSpot twoWheelerSpots[]=new ParkingSpot[4];
        ParkingSpot fourWheelerSpots[]=new ParkingSpot[2];

        for(int i=0;i<twoWheelerSpots.length;i++)
        {
            twoWheelerSpots[i]=new TwoWheelerParkingSpot(10);
            twoWheelerSpots[i].setId(i);
            twoWheelerSpots[i].setIsEmpty(true);
        }
        for(int i=0;i<fourWheelerSpots.length;i++)
        {
            fourWheelerSpots[i]=new FourWheelerParkingSpot(20);
            fourWheelerSpots[i].setId(i);
            fourWheelerSpots[i].setIsEmpty(true);
        }
        EntranceGateManager gateManager=new EntranceGateManager(twoWheelerSpots,fourWheelerSpots);
        TicketManager ticketManager=new TicketManager(gateManager);
        ExitGateManager exitGateManager=new ExitGateManager(gateManager);
        Person twoWheelerClient=new Person(twoWheelerFactory, 123, "Splender");
        Vehicle twoWheeler=twoWheelerClient.getVehicle();
        
        gateManager.setVehicle(twoWheeler);
        ticketManager.createTicket();

        Person fourWheelerClient=new Person(fourWheelerFactory, 456, "Nano");
        Vehicle fourWheeler=fourWheelerClient.getVehicle();

        gateManager.setVehicle(fourWheeler);
        ticketManager.createTicket();

        Person twoWheelerClient2=new Person(twoWheelerFactory, 789, "Hero-Honda");
        Vehicle twoWheeler2=twoWheelerClient2.getVehicle();
        
        gateManager.setVehicle(twoWheeler2);
        ticketManager.createTicket();

        Person twoWheelerClient3=new Person(twoWheelerFactory, 101112, "Hero-Honda");
        Vehicle twoWheeler3=twoWheelerClient3.getVehicle();
        
        gateManager.setVehicle(twoWheeler3);
        ticketManager.createTicket();

        Person twoWheelerClient4=new Person(twoWheelerFactory, 131415, "Hero-Honda");
        Vehicle twoWheeler4=twoWheelerClient4.getVehicle();
        
        gateManager.setVehicle(twoWheeler4);
        ticketManager.createTicket();

        exitGateManager.unParkVehicle(1, twoWheeler, new Card());

        Person twoWheelerClient5=new Person(twoWheelerFactory, 131415, "Hero-Honda");
        Vehicle twoWheeler5=twoWheelerClient5.getVehicle();
        
        gateManager.setVehicle(twoWheeler5);
        ticketManager.createTicket();

        Person twoWheelerClient6=new Person(twoWheelerFactory, 131415, "Hero-Honda");
        Vehicle twoWheeler6=twoWheelerClient6.getVehicle();
        
        gateManager.setVehicle(twoWheeler6);
        ticketManager.createTicket();

       
        

    }
}
