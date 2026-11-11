package com.java.arrays;

import java.util.Arrays;

public class PositiveNegative {

	public static void main(String[] args) {

		int[] numbers = { -1, 1, -2, 4, -3, 4 };
		int positive = 0;
		int negative = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				System.out.println("The Positive Numbers are:" + numbers[i]);
				positive++;
			} else {
				if (numbers[i] < 0) {
					System.out.println("The Negative numbers are:" + numbers[i]);
					negative++;
				}
			}

		}
//		System.out.println(Arrays.toString(numbers));
		System.out.println("The Count of thepositive Number is:" + positive);
		System.out.println("The count of the Negative Number is:" + negative);
	}

}
