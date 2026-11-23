package com.TwoDArrays;

import java.util.Arrays;

public class ReverseOfElement {

	public static void main(String[] args) {

		int[] arr = { 12, 45, 67, 34, 14 };

		for (int i = 0; i < arr.length; i++) {

			int num = arr[i];
			int rev = 0;

			while (num > 0) {
				int r = num % 10; // 1
				rev = rev * 10 + r;// 0*10+2 =2
				num = num / 10;

			}

			arr[i] = rev;
		}
		System.out.println(Arrays.toString(arr));

	}

}
