package com.java.arrays;

public class Evenoddnumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int count = 0;
		int count1 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("Even number is :" + arr[i]);
				count++;
			} else {
				System.out.println("Odd Number is:" + arr[i]);
				count1++;
			}

		}

		System.out.println("the count of the even number is:" + count);
		System.out.println("the count of the odd number is:" + count1);
	}

}
