package com.java.arrays;

public class Sum {

	public static void main(String[] args) {

		int[] numbers = { 89, 99, 67, 46, 54 };

		int sum = 0;
		int avg = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];

		}

//		for (int n : numbers) {
//			sum = sum + n;
//		}
//		
//		avg = sum / numbers.length;

		System.out.println("The sum of the given number is :" + sum);
		System.out.println("The Avg of the given number is:" + avg);
	}

}
