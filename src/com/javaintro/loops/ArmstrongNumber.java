package com.javaintro.loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();

		int r = 0;
		int sump = 0;
		int digitcount = 0;
		int n1 = n;
		int temp = n;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			digitcount++;
		}

		while (n1 > 0) {
			r = n1 % 10;
			n1 = n1 / 10;
			sump = (int) (sump + Math.pow(r, digitcount));

		}
		System.out.println("The sum of the given number is:" + sump);

		if (sump == temp) {
			System.out.println("The given number is Amstrong Number");
		} else {
			System.out.println("The given number is  Not Amstrong Number");
		}
	}

}
