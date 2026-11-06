package com.javaintro.loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = Sc.nextInt();
		int r = 0;
		int reverse = 0;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			reverse = reverse * 10 + r;
		}
		System.out.println("The reverse of a given number is:" + reverse);

	}

}
