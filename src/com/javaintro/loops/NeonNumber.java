package com.javaintro.loops;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();

		int square = n * n;
		int sum = 0;

		while (square > 0) {
			int rem = square % 10;
			sum = sum + rem;
			square = square / 10;
		}

		if (sum == n) {
			System.out.println("Neon Number");
		} else {
			System.out.println("Not a Neon Number");

		}
	}

}
