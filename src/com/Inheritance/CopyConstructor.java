package com.Inheritance;
// same as shallowcopy 
class Employee1 {

	int id;
	String name;
	Address1 address;

	Employee1(Employee1 e) {
		this.id = e.id;
		this.name = e.name;
		this.address = e.address;
	}

	public Employee1(int id, String name, Address1 address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;

	}

	void employeeInfo() {
		System.out.println("Employee id:" + id);
		System.out.println("Employee Name:" + name);
		System.out.println("Employee Address:" + address.city);
		System.out.println("--------------------------------");
	}

}

class Address1 {
	String city;

	public Address1(String city) {
		super();
		this.city = city;
	}

}

public class CopyConstructor {

	public static void main(String[] args) {
		Address1 a1 = new Address1("Nizamabad");
		Employee1 emp = new Employee1(1, "Divya", a1);
		emp.employeeInfo();

		Employee1 emp1 = new Employee1(emp);
		emp1.employeeInfo();

		emp1.id = 2;
		emp1.name = "Trisha";
		emp1.address.city = "Hyderabad";
		emp1.employeeInfo();
		emp.employeeInfo();

	}

}
