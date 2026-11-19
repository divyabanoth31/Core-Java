package com.TwoDArrays;

import java.util.Arrays;

public class RemovingDuplicate {

	public static void main(String[] args) {
		
		int [] a = {1,2,4,5,6,2,4,2,1,3};
		
		for(int i = 0; i < a.length; i++) {
			boolean duplicate = false;
			for(int j = 0; j < i;j++) {
				if(a[i] == a[j]) {
					duplicate = true;
					break;
				}
			}
			
			if(!duplicate) {
				System.out.print(a[i] + " ");
			}
		}
		

	}

}
