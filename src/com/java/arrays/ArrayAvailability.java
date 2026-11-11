package com.java.arrays;

import java.util.Scanner;

public class ArrayAvailability {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 7, -5, 6 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int key = sc.nextInt();
		boolean status = false;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == key) {
				status = true;
				break;

			}
		}
		if (status) {
			System.out.println("the given number is found");
		} else {
			System.out.println("the given number not found");
		}
	}

}
