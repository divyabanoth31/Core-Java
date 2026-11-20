package com.javaintro;

public class ClassLoading {
	
	

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("Main Method Started");
		
		// Fully quallified of the Classes = pacakge name +class name
		
		// The below two classes are loading with  the help of bootstrap class loader
		System.out.println(Class.forName("java.lang.System"));
	    System.out.println(Class.forName("java.lang.String"));
		
	   
	   
	   System.out.println("main method ended");
        
        
	}

}
