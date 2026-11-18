package com.DSA;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a = { 9, 5, 7, 3, 1 };

		int temp = 0;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
			    if(a[j] > a[j + 1]) {
			    	temp = a[j];
			    	a[j] = a[j+1];
			    	a[j +1] = temp;
			    }

			}
		}

		System.out.println(Arrays.toString(a));
	}

}
