package com.Abstraction;

public class TestVehicle {

	public static void main(String[] args) {
		System.out.println("main Method started");
		Vehicle c = new Car();
        c.start();
        c.stop();
        c.fuelType();
        c.maintenance();
        Vehicle.companyInfo();
        Vehicle.safetyRules();
        c.VehicleInfo();
        
        

        
        System.out.println("----------------");
        
        Vehicle b = new Bike();
        b.start();
        b.stop();
        b.fuelType();
        b.maintenance();
        Vehicle.companyInfo();
        Vehicle.safetyRules();
        c.VehicleInfo();
	}

}
