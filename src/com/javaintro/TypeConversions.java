package com.javaintro;

public class TypeConversions {
	
	int studentId = 101;
	String studentName = "divya";
	int age = 22;
	double marks = 10.0;
	char grade = 'A';
	boolean exam_passed = true;
	
	public static void main(String[] args) {
		TypeConversions t = new TypeConversions();
		System.out.println("student id : " + t.studentId);
		System.out.println("student name : " + t.studentName);
		System.out.println("student age : " + t.age);
		System.out.println("student marks : " + t.marks);
		System.out.println("student grade : " + t.grade);
		System.out.println("student score : " + t.exam_passed);
	}

}
