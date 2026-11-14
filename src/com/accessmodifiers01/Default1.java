package com.accessmodifiers01;

public class Default1 {

	public static void main(String[] args) {
		
		Default d = new Default();
		d.age = 22;
		
		System.out.println(d.age);
		d.dispaly();
		System.out.println(d.salary);
		
		d.add(10, 20);
		d.deposit(1000);
		
		

	}

}
