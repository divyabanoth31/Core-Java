package com.javaintro;

import java.util.Scanner;

public class LogicalStatment3 {
	void add (int a, int b) {
		System.out.println(a+b);
	}
	
	void  sub (int a, int b) {
		System.out.println(a-b);
	}
	
	void div (int a, int b) {
		System.out.println(a/b);
	}
	
	void mul (int a, int b) {
		System.out.println(a*b);
	}
	
	

	public static void main(String[] args) {
		
		LogicalStatment3 s=new LogicalStatment3();
	
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b = sc.nextInt();
		
		
		switch(a) {
		case 1: 
			System.out.println("Addition of numbers");
			s.add(a,b);
			break;
		case 2: 
			System.out.println("Subtraction of numbers");
		    break;
		case 3: 
			System.out.println("Division of numbers");
			break;
		case 4: 
			System.out.println("Multiplication of numbers");
			break;	
			
		default:
			System.out.println("invalid ");
		}
		
		
	}

}
