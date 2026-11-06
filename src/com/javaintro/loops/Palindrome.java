package com.javaintro.loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int temp = n;
		int r = 0;
		int reverse = 0;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			reverse = reverse * 10 + r;
		}
		System.out.println("The Reverse of the given number is:" + reverse);

		if (temp == reverse) {
			System.out.println("The given number is Palindrome");
		} else {
			System.out.println("The given number is Not Palindrome");
		}
	}

}
