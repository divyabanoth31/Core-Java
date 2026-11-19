package com.DSA;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] a = {9,3,2,5,1,7,8};
		
		int temp = 0;
		
		for(int i = 0; i < a.length-1;i++) {
			int minIndex = i;
			for(int j = i+1; j < a.length;j++) {
				if(a[j] < a[minIndex]) {
					minIndex = j;
				}
			} 
			
			temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
			System.out.println(Arrays.toString(a));	
		}

	}


