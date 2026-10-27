package com.javaintro;

import java.util.Scanner;

public class LogicalStatements {

    
	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	int studentMarks = sc.nextInt();
	
	if (studentMarks > 100) {
		System.out.println("In valid ");
	}
	else if (studentMarks >= 90) {
		System.out.println("A Grade");
	}
	
	else if(studentMarks >= 80) {
		System.out.println("B Grade");
	}
	
	else if(studentMarks >= 70) {
		System.out.println("C Grade");
	}
	
	else if (studentMarks >=60) {
		System.out.println("D Grade");
	}

	else   {
		System.out.println("Fail");
	}
	
	}

}
