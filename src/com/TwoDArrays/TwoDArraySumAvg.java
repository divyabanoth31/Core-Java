package com.TwoDArrays;

public class TwoDArraySumAvg {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 1, 4, 5 } };

		int sum = 0;
		int avg = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum = sum + a[i][j];
				avg = sum / a.length;

			}

		}

		System.out.println("The sum of the numbers is: " + sum);
		System.out.println("The avg of the numbers is: "+ avg);
	}

}
