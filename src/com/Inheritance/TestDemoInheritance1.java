package com.Inheritance;

class Device1 {
	private String brand;
	 private double price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	void display() {
		System.out.println(brand + " is Brand");
		System.out.println(price + " is Price");

	}

}

class Loptop {

	String ram;
	String processors;

	void runIDE() {
		System.out.println("Running IDE");
	}

	void compilecode() {
		System.out.println("Code is Compliling");
	}

	void displayDetails() {
		System.out.println(ram + "Ram");
		System.out.println(processors + "Processors");
	}
}

class Mobile {

	String camera;
	int battery;

	void makeCall() {
		System.out.println("Make a call");
	}

	void takePhoto() {
		System.out.println("Click a photo");
	}

	void display1() {
		System.out.println(camera + "Camera");
		System.out.println(battery + "Battery");

	}
}

public class TestDemoInheritance1 {

	public static void main(String[] args) {

		Device1 d = new Device1();

		d.setBrand("ACER");
		d.setPrice(50000.0);
		d.display();

//		System.out.println(d.getBrand());
//		System.out.println(d.getPrice());
		System.out.println("-----------------");

		Loptop l = new Loptop();
		l.ram = "12GB";
		l.processors = "i7";
		l.displayDetails();
		l.runIDE();
		l.compilecode();
		System.out.println("---------------");

//		System.out.println(l.ram);
//		System.out.println(l.processors);

		Mobile m = new Mobile();
		m.camera = "60 MP";
		m.battery = 60000;
		m.display1();
		m.makeCall();
		m.takePhoto();

	}

}
