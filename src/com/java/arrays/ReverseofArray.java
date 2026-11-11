package com.java.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseofArray {

	public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5, 6};

        int[] b = new int[a.length];

        for(int i = a.length - 1; i >= 0; i--) {
            b[a.length - 1 - i] = a[i];
        }

        System.out.println(Arrays.toString(b));
	}

}