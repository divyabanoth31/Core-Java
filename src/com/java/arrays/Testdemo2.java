package com.java.arrays;

import java.util.Arrays;

public class Testdemo2 {

	public static void main(String[] args) {

		int[] a = { 0, 1, 3, 0, 0, 2 };
		int index = 0;
		int[] temp=new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				temp[index] = a[i];
				index++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				temp[index] = a[i];
				index++;
			}
		}

		System.out.println(Arrays.toString(temp));

	}

}
