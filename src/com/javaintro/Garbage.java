package com.javaintro;

public class Garbage {
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalized method called!");
	}
	
	
	public static void main(String[] args) {
		
		// Nullifing object
		    Garbage obj1 = new Garbage();
	        obj1 = null;
	        
	     // Reassigning the reference
	        Garbage obj2 = new Garbage();
	        obj2 = new Garbage();
		
	        
	        // Anonymous object
	        new Garbage();

	        //  Island of Isolation
	        Garbage obj3 = new Garbage();
	        Garbage obj4 = new Garbage();

	        obj3 = obj4;
	        obj4 = obj3;

	        // Request JVM to run Garbage Collector
	        System.gc();
		
		
		System.out.println("Main method started!");
		
		System.out.println("main method ended!");
	}		

}
