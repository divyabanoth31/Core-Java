package com.DSA;

import java.util.Arrays;
import java.util.Scanner;

public class RotationalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many times to rotate");
		int r = sc.nextInt();
		

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		 rotaionalArray(arr,r);

		System.out.println(Arrays.toString(arr));

	}
	
	static void rotaionalArray(int [] arr, int r) {

		int start = 0;
		int end = arr.length - 1;

		reversedArray(arr, start, end);
		
		reversedArray(arr, start, r-1);
		
		reversedArray(arr, r, end);
	}

	static void reversedArray(int[] arr, int start, int end) {
		while (start < end) {
			int temp = 0;
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
	}
}
