package com.javaintro.loops;

import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = Sc.nextInt();

//		int sum = 0;
//		for (int i = 0; i <= n; i++) {
//			sum = sum + i;
//
//		}
//		System.out.println("sum of the given number is:" + sum);
//
//		
		
		// sum of the even number
//		
//		int sum = 0;
//		for(int i = 0; i <=n; i++) {
//			if(i % 2 == 0) {
//				sum = sum + i;
//			}
//		}
//		System.out.println("sum of the given number is :"+sum);
	
	//  sum of the odd number
		
//		int sum = 0;
//		for(int i = 1; i<=n ; i=i+2) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
	
	// sum of the digits
		
		int r = 0;
		int sum = 0;
		
		while(n>0) {
			r = n%10;
			n = n/10;
			sum = sum + r;
		}
		System.out.println("The sum of the digit is:"+sum);
	
	}
}
