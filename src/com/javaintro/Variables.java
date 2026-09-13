package com.javaintro;

public class Variables {
	// static variables
	static int countryId;
	static String countryName;
	
	//instance variables
	int jerseynumber ;
	String cricketerName;

	
	public static void main(String[] args) {
		System.out.println("Welcome to Indian Cricket Team");
		
		// assessing static varibles
		countryId = 91;
		countryName = "India";
		System.out.println("country Id : " + countryId);
		System.out.println("country Name : " + countryName);
		
		countryId = 92;
		countryName = "usa";
		System.out.println("country Id : " + countryId);
		System.out.println("country Name : " + countryName);
	
		
		// assessing instance varibles object creation
		Variables msd = new Variables();
		msd.jerseynumber = 7;
		msd.cricketerName = "MHD";
		System.out.println("jerseynumber:"+ msd.jerseynumber);
		System.out.println("cricketerName:"+ msd.cricketerName);
	
		Variables vk = new Variables();
		vk.jerseynumber = 18;
		vk.cricketerName = "virat";
		System.out.println("jerseynumber:"+ vk.jerseynumber);
		System.out.println("cricketerName:"+ vk.cricketerName);
		
		Variables rs = new Variables();
		rs.jerseynumber = 8;
		rs.cricketerName = "rohit";
		System.out.println("jerseynumber:"+ rs.jerseynumber);
		System.out.println("cricketerName:"+ rs.cricketerName);
		System.out.println("country Id : " + countryId);
		System.out.println("country Name : " + countryName);
		
		Variables jaddu = new Variables();
		jaddu.jerseynumber = 9;
		jaddu.cricketerName = "jaddu sk";
		System.out.println("jerseynumber:"+ jaddu.jerseynumber);
		System.out.println("cricketerName:"+ jaddu.cricketerName);
		System.out.println("country Id : " + countryId);
		System.out.println("country Name : " + countryName);
	
		// static variables stored in method area
		//instance variable store in heap area 
		
		
		//static variable is used  when all the objects have same value. 
		// instance variable is used when all the objects have different values.
		
		//when don't assign a value to variables it automatically stores 0 for integer and null for string

		
	}
	  
}
