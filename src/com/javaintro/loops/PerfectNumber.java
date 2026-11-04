package com.javaintro.loops;

//perfect factor is sum of the factors excluding itselef
//ex:  factor of 6 ,excluding 6  is 1 2 3  their sum is 1+2+3 = 6
// factor of 28 is 1 2 4 7 14 excluding 28 thier sum is 1+2+4+7+14 = 28
// factor of 496 is perfect number
// input 6
//output true or false
import java.util.Scanner;
public class PerfectNumber {

	static boolean isperfect(int n) {
		boolean status = false;
		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		
		if (sum == n) {
			status = true;
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();

		boolean status = isperfect(n);

		if (status) {
			System.out.println("The given number is perfect");
		} else {
			System.out.println("The given number is not perfect");
		}

	}

}
