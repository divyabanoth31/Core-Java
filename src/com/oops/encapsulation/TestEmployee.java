package com.oops.encapsulation;

public class TestEmployee {
	
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