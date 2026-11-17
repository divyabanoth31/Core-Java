package com.Inheritance;

class Vehicle {
	
	String name;
	double speed;
	
	void start() {
		System.out.println(name + "is starting");
	}
	
	void stop() {
		System.out.println(name + "is stopping");
	}
	
	void dispaly() {
		System.out.println("Vehicle name :"+ name);
		System.out.println("Speed :"+ speed);
		
	}

}

    class Car extends Vehicle {
    	
    	void sunroof() {
    		System.out.println("Sunroof is openning");
    	}

 }

    class Bike extends Vehicle {
    	
    	void doWheelie() {
    		System.out.println("Bile is doing Wheelie");
    	}
  }

   class Truck extends Vehicle {
	   
	   void loadCargo() {
		   System.out.println("Truck is loading cargo");
	   }
  }


    public class TestDemoInheritance {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.name = "BMW";
		c.speed = 90.0;
		
		c.dispaly();
		c.start();
		c.sunroof();
		c.stop();
		System.out.println("------------------");
		
		Bike b = new Bike();
		b.name = "Royal Enfiled";
		b.speed = 100.0;
		
		b.dispaly();
		b.start();
		b.doWheelie();
		b.stop();
		
		System.out.println("------------------");
		
		Truck t = new Truck();
		t.name = "Tata";
		t.speed = 90.0;
		
		t.dispaly();
		t.start();
		t.loadCargo();
		t.stop();
		
		

	}

}
