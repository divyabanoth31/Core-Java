package com.Inheritance;

class Vehicle1 {

	int speed = 50;

	void display() {
		System.out.println("Speed of a Vehicle is:" + speed);
	}

}

class Car1 extends Vehicle1 {

	int speed = 100;

	@Override
	void display() {
		System.out.println("Speed of a car is:" + speed);

	}

}

public class TestDemoOverride {

	public static void main(String[] args) {

		Vehicle1 v = new Car1();

		v.display();
	}

}
