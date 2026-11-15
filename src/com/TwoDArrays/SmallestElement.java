package com.TwoDArrays;

public class SmallestElement {

	public static void main(String[] args) {
    int [][] a = {{10,5,6},{10,11,8},{19,30,20}};
		 
		
		int min = a[0][0];
		
		for(int i = 0; i < a.length;i++) {
			for(int j = 0 ; j < a[i].length;j++) {
				if (a[i][j] < min) {
					min = a[i][j];
				}
			}

		}
		System.out.println("The Minimun number is:"+ min);

	}

}
