package com.java.arrays;

import java.util.Arrays;

public class RoundedOfElements {

	public static void main(String[] args) {
		
		int [] a = {79,84,56,89};
		
		for(int i = 0; i < a.length;i++) {
			int r = a[i] % 10;
			if( r <=5 ) {
				a[i] = a[i] -r;
			}else {
				int d = 10 - r;
				a[i] = a[i] + d;
			}
			
		}
		
		System.out.println(Arrays.toString(a));
	}

}

