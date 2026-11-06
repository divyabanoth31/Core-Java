package com.javaintro.loops;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		int digitcount = 0;
		int r = 0;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			digitcount++;
		}
		System.out.println("The Given Number digit count is:" + digitcount);

	}
}
