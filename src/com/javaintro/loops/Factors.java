package com.javaintro.loops;

import java.util.Scanner;

// input 24
//output 1 2 3 4 6 8 12 24
public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		findfactors(n);
	}

	static void findfactors(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
