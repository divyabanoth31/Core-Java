package com.TwoDArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintingDuplicate {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,1,2,3};
		
//		int [] result = Arrays.stream(arr).distinct().toArray();
//		System.out.println(Arrays.toString(result));
		
		
		// Two ways
		Set <Integer> s = new HashSet<>();
		
		for(int a : arr) {
			s.add(a);
		}
		System.out.println(s);
	}

}
