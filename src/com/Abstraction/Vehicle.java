package com.Abstraction;

public interface Vehicle {
	
	public abstract void start();
	
	public abstract void stop();
	
	public abstract void fuelType();
	
	// default method
	 default void maintenance() {
		 System.out.println("Vehicle needs regular maintenance");
	 }
	 
	 // To call private methods we call in default or static methods
	 default void VehicleInfo() {
		 System.out.println("Vehicle needs maintenance");
		 engineCheck();
	 }
	
	 //Static method
	public static void companyInfo() {
		 System.out.println("Vehicle Manufacturing Company");
		 companyDetails();
	 }
	 
	public static void safetyRules() {
		 System.out.println("Follow traffic rules and wear a helmet");
	 }
	
	private void engineCheck() {
		System.out.println("Engine checking completed");
	}
	
	private static void companyDetails() {
        System.out.println("Company: BMW");
	}
}
