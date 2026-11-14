package com.Inheritance;

class Student implements Cloneable{

	int empId;
	String empName;
	Department department;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + "]";
	}



	public Student(int empId, String empName, Department department) {
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}
}

class Department {
	String department;
	
	

	@Override
	public String toString() {
		return "Department [department=" + department + "]";
	}



	public Department(String department) {
		this.department = department;
	}
}

public class Shallowcopy2 extends CloneNotSupportedException {

	public static void main(String[] args) throws CloneNotSupportedException {
		Department d = new Department("IT");
		Student s1 = new Student(1, "Divya", d);
		
		System.out.println(s1.empId);
		System.out.println(s1.empName);
		System.out.println(s1.department.department);
		
		 Student s2 = (Student)  s1.clone();
		 
		 s2.empId = 2;
		 s2.empName = "Trisha";
		 s2.department.department = "CSE";
 
		 System.out.println(s1.empId);
		System.out.println(s1.empName);
	 	System.out.println(s1.department.department);
	 	
	 	System.out.println(s2.empId);
		System.out.println(s2.empName);
		System.out.println(s2.department.department);
		 

	}

}
