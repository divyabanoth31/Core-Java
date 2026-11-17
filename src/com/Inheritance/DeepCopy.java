package com.Inheritance;

    class Employee2 {

	int id;
	String name;
	Address2 address;

	Employee2(Employee2 emp) {
		this.id = emp.id;
		this.name = emp.name;
		this.address = new Address2(emp.address);

	}

	public Employee2(int id, String name, Address2 address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void employeeInfo() {
		System.out.println("Employee id:" + id);
		System.out.println("Employee name:" + name);
		System.out.println("Employee Address:" + address.city);
		System.out.println("------------------------------");
	}

}

class Address2 {
	String city;
	
	// for deepcopy we have create constructor in this class also if we don't create here it will be shallowcopy / copy constructor 
	// Deep copy is when copy one address1 to another address2 data then when we change address2 data it will not effect to address1 data
	// first class we create new object like this this.address = new Address2(emp.address);

	Address2(Address2 a1) {
		this.city = a1.city;
	}

	public Address2(String city) {
		super();
		this.city = city;
	}

}

    public class DeepCopy {

	public static void main(String[] args) {
		Address2 ad = new Address2("Karimnagar");
		Employee2 e = new Employee2(1, "Arun", ad);
		e.employeeInfo();

		Employee2 e1 = new Employee2(e);
		e1.employeeInfo();

		e1.id = 2;
		e1.name = "Divya";
		e1.address.city = "Nizamabad";
		e1.employeeInfo();
		e.employeeInfo();

	}

}
