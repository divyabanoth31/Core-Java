package com.accessmodifiers01;

public class Default {
	
	int age;
	
	int salary;
	
	int balance = 5000;
	int amount;
	
	 void dispaly() {
		salary = 20000;
	}
	
	 void add(int a , int b) {
		System.out.println((a+b));
	}
	
	void deposit(int amount) {
		balance = balance + amount;
		System.out.println(balance);
	}
	
	 Default(){
		System.out.println("vehicle");
	}

	public static void main(String[] args) {
		
		
		
	}

}
