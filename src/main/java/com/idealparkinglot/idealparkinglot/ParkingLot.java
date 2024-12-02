package com.idealparkinglot.idealparkinglot;

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
        Person twoWheelerClient=new Person(twoWheelerFactory, 123, "Splender");
        Vehicle twoWheeler=twoWheelerClient.getVehicle();
        twoWheeler.vehicleDetail();

        VehicleFactory fouVehicleFactory=new FourWheelerFactory();
        Person fourWheelerClient=new Person(fouVehicleFactory, 456, "Nano");
        Vehicle fourWheeler=fourWheelerClient.getVehicle();
        fourWheeler.vehicleDetail();

    }
}
