package com.javaintro.loops;

import java.util.Scanner;

public class Testdemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		for(int i = 1; i<=100; i++) {
			int count = 0;
					
		for (int j = 1; j<=100; j++) {
			if(i%j==0) {
				count ++;
			}
		}
		if(count == 2) {
			System.out.println(i+ " ");
		}
		}
		
	}

}
