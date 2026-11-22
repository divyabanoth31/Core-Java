package com.javaintro;

public class Employee {
	static void method1() {
		System.out.println("method1 called!");
	}
	
	static void method2() {
		System.out.println("method 2 is called!");
	}
	
	static void method3() {
		System.out.println("method 3 is called!");
	}
	
	
	
	
	 public void instanceMethod4() {
	        System.out.println("Instance Method 1 is called");
	    }

	   
	    public void instanceMethod5() {
	    	System.out.println("Instance method 2 is called!");
	    }

	public static void main(String[] args) {
		
		method1();
		method2();
		method3();
		
		Employee e = new Employee();
		e.instanceMethod4();
		e.instanceMethod5();
		
     System.out.println("No method called !");

   }
}
