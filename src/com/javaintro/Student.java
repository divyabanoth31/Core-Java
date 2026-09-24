package com.javaintro;

public class Student {
	static String collegeName;
	
	String studentName;
	int studentId;
	String studentBranch;
	
			
	public static void main(String[] args) {
		System.out.println("Welcome to the College!!");
		
		collegeName = "Malla Reddy Engineering College";
		System.out.println(collegeName );
		
		Student s1 = new Student();
		s1.studentName = "Divya";
		s1.studentId = 101;
		s1.studentBranch = "CSE";
		System.out.println("studentName: " + s1.studentName);
		System.out.println("studentId: " + s1.studentId);
		System.out.println("studentBranch: " + s1.studentBranch);
		
		Student s2 = new Student();
		s2.studentName = "Trisha";
		s2.studentId = 102;
		s2.studentBranch = "EEE";
		System.out.println("studentName: " + s2.studentName);
		System.out.println("studentId: " + s2.studentId);
		System.out.println("studentBranch: " + s2.studentBranch);

	}

}
