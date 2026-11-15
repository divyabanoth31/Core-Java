package com.TwoDArrays;

public class ColumnSum {

	public static void main(String[] args) {
		int[][] a = { { 4, 5, 6 }, { 2, 3, 6 }, { 7, 8, 9 } };
		int max = a[0][0];

		for (int j = 0; j < a[0].length; j++) {
			int sum = 0;
			if(a[j][j] > max) {
				max = a[0][j];
			}

			for (int i = 0; i < a.length; i++) {
				sum = sum + a[i][j];
			}

			System.out.println("Cloumn Sum is:" + sum);
			System.out.println("Cloumn max is:"+ max);
		}

	}

}
