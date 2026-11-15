package com.TwoDArrays;

public class LargestElement {

	public static void main(String[] args) {

		int[][] a = { { 2, 3, 5 }, { 10, 23, 45 }, { 1, 7, 9 } };

		int max = a[0][0];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
 
			}

		}
		System.out.println("The Laargest element is:" + max);
	}

}
