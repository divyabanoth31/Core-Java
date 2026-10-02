package com.javaintro;

public class Student1 {
	String studentName ;
	int studentId ;
	String studentCourse ;
	
	int marks1 ;
    int marks2  ;
    int marks3  ;
    
    void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Id: " + studentId);
        System.out.println("Course: " + studentCourse);
    }
       
    

    void calculateTotal() {
        int total = marks1 + marks2 + marks3;
        System.out.println("Total Marks: " + total);
    }

    
    void calculateAverage() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3;
        System.out.println("Average Marks: " + average);
    }
	
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.studentName = "divya";
		s.studentId = 101;
		s.studentCourse = "jfs";
		
		s.marks1 = 99;
		s.marks2 = 89;
		s.marks3 = 100;
		
		Student1 s1 = new Student1();
		s1.studentName = "divya";
		s1.studentId = 102;
		s1.studentCourse = "python";
		
		s1.marks1 = 67;
		s1.marks2 = 79;
		s1.marks3 = 90;
		
		    s.displayStudentDetails();
	        s.calculateTotal();
	        s.calculateAverage();
	        
	        s1.displayStudentDetails();
	        s1.calculateTotal();
	        s1.calculateAverage();
	
	}

}


