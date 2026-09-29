package com.javaintro;

public class Datatypes {
	
	// Data Types
    byte age = 22;
    short number_ofstudents= 100;
    int salary = 50000;
    long population_india = 1005000500l;
    float percentage = 10.0F;
    double bank_balance = 5076.67;
    char gender = 'f';
    boolean isjavalearner = true;
    
	public static void main(String[] args) {
		Datatypes d = new Datatypes();
		System.out.println("Age : " + d.age);
		System.out.println("Number of Student in College : " + d.number_ofstudents);
		System.out.println("Salary : " + d.salary);
		System.out.println("population : " + d.population_india);
		System.out.println("Percentage : " + d.percentage);
		System.out.println("Bank Balance : " + d.bank_balance);
		System.out.println("Gender : " + d.gender);
		System.out.println("Java learner : " + d.isjavalearner);
		
	}

}
