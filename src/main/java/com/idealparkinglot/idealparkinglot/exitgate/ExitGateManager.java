package com.idealparkinglot.idealparkinglot.exitgate;

import com.idealparkinglot.idealparkinglot.entrance.EntranceGateManager;
import com.idealparkinglot.idealparkinglot.parkingSpot.ParkingSpot;
import com.idealparkinglot.idealparkinglot.parkingspotmanager.ParkingSpotManager;
import com.idealparkinglot.idealparkinglot.payment.PaymentStrategy;
import com.idealparkinglot.idealparkinglot.paymentcalculation.PaymentCalculatorManager;
import com.idealparkinglot.idealparkinglot.vehicle.Vehicle;

public class ExitGateManager {
    EntranceGateManager entranceGateManager;
    PaymentCalculatorManager paymentCalculatorManager;
    //ParkingSpot twoWheeler[]=entranceGateManager.getTwoWheeler();
    //ParkingSpot fourWheeler[]=entranceGateManager.getFourWheeler();
    public ExitGateManager(EntranceGateManager entranceGateManager)
    {
        this.entranceGateManager=entranceGateManager;
    }

    public void unParkVehicle(int spot,Vehicle vehicle,PaymentStrategy paymentStrategy)
    {
        entranceGateManager.setVehicle(vehicle);
        ParkingSpotManager spotManager=entranceGateManager.getParkingSpotManager();
        ParkingSpot spots[]=spotManager.geParkingSpot();
        paymentCalculatorManager=new PaymentCalculatorManager(spots[spot].getPrice(),paymentStrategy);
        spots[spot].unparkVehicle();
    }
}
