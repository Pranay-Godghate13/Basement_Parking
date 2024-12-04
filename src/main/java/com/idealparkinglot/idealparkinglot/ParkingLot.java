package com.idealparkinglot.idealparkinglot;

import com.idealparkinglot.idealparkinglot.entrance.EntranceGateManager;
import com.idealparkinglot.idealparkinglot.parkingspotmanager.FourWheelerParkingSpotManagerFactory;
import com.idealparkinglot.idealparkinglot.parkingspotmanager.TwoWheelerParkingSpotManagerFactory;
import com.idealparkinglot.idealparkinglot.parkingspotmanager.TwoWheelerSpotManager;
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
        EntranceGateManager gateManager=new EntranceGateManager();

        Person twoWheelerClient=new Person(twoWheelerFactory, 123, "Splender");
        Vehicle twoWheeler=twoWheelerClient.getVehicle();
        
        gateManager.setVehicle(twoWheeler);
        gateManager.createTicket();

        Person fourWheelerClient=new Person(fourWheelerFactory, 456, "Nano");
        Vehicle fourWheeler=fourWheelerClient.getVehicle();

        gateManager.setVehicle(fourWheeler);
        gateManager.createTicket();

        Person twoWheelerClient2=new Person(twoWheelerFactory, 789, "Hero-Honda");
        Vehicle twoWheeler2=twoWheelerClient2.getVehicle();
        
        gateManager.setVehicle(twoWheeler2);
        gateManager.createTicket();


       
        

    }
}
