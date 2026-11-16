package com.oops.encapsulation;

public class Employee {
	
	private int id;
	private String name;
	double salary;
	String password;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setId(1);
		System.out.println(e.getId());
		
		e.setName("Divya");
		System.out.println(e.getName());
		
		e.setSalary(50000.0);
		System.out.println(e.getSalary());
		
		e.setPassword("divya123");
		System.out.println(e.getPassword());
		
		

	}

}
