package com.Inheritance;

class Employee implements Cloneable {
	int id;
	String name;
	Address address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Employee(int id, String name, Address address) {
		this.id = id; // primitive
		this.name = name; // String is immutable
		this.address = address; // address is another object when we write like no new object is created.uses
								// for both object employee and address

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}

class Address {
	String city;

	public Address(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

}

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address a = new Address("Hyderabad");
		Employee emp = new Employee(1, "Divya", a);

////		System.out.println(emp); // by using tostring we can print values also or we can print link below alao
//		System.out.println(emp.id);
//		System.out.println(emp.name);
//		System.out.println(emp.address.city);
//		System.out.println("------------");

		// we can use object 1 values and accaes to object 2 for this we use clone
		// clone is the protected modifier so we have override clone method in employee
		// class.
		Employee emp1 = (Employee) emp.clone();

		emp1.id = 2;
		emp1.name = "Trisha";
		emp1.address.city = "banglore";
		// in output if we give another address like banglore then for both objects values it will change to banglore only because we use shallow copy here.

		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.address.city);
		System.out.println("------------");
		
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		System.out.println(emp1.address.city);
	}

}
