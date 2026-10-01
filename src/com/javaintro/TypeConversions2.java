package com.javaintro;

public class TypeConversions2 {
	// int to double explicit 
    static  int age =  10;
	 static double marks = age;
	 
	 //double to int implicit
	 static double d1 = 10.0;
	 static int d2 = (int) d1;
	 
	 // int to char implicit
	 static int a = 65;
	 static char a2  = (char) a;
	 
	 // char to int explicit
	static char grade = 'a';
	 static int number = grade;
	 
	 // byte to short implicit
	 static byte n1 = (byte) 128;
	 static short n2 =  n1;
	 
	 // short to byte
	static  short b1 = 32767;
	static int b2 = b1; 
	public static void main(String[] args) {
		System.out.println(marks);
		System.out.println((int)marks);
		System.out.println(grade);
		System.out.println(d2);
		System.out.println(a2);
		System.out.println(n2);
		System.out.println(d2);
		System.out.println(number);	
	}

}
