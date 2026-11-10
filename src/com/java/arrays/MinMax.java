package com.java.arrays;

public class MinMax {

	public static void main(String[] args) {
		
		int[] numbers = {23, 4, 8, 75, 28};
		
		int min = numbers[0];
		int max = numbers[0];
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < min) {
				min = numbers[i];
			}
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		
		System.out.println("The minimum of the given number is:"+min);
		System.out.println("The maximum of the given number is:"+max);
	}

}
