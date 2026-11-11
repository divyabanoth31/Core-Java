package com.java.arrays;

import java.util.Arrays;

public class Storing {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5};
		int [] b = {10,20,40,50};
		int size = a.length + b.length;
		int [] c = new int[size];
		
		for(int i = 0; i <a.length;i++) {
			c[i] = a[i];
		}
		for(int i = 0; i <b.length;i++) {
			c[a.length+i] = b[i];
		}
        System.out.println(Arrays.toString(c));
        
	}

}
