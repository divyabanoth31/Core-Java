
package com.javaintro.loops;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();

		int square = n * n;
		int temp = n;
		boolean f = true;

		while (temp > 0) {
			if (temp % 10 != square % 10) {
				f = false;
				break;
			}
			temp = temp / 10;
			square = square / 10;
		}

		if (f) {
			System.out.println("The given number is  Automorphic Number");
		} else {
			System.out.println("The given number is not Automorphic Number");
		}
	}
}
