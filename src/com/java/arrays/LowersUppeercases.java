package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LowersUppeercases {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Elements size");
		int size = sc.nextInt();

		String[] names = new String[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter name:" + (i + 1));
			names[i] = sc.next();
		}
		for (int i = 0; i < size; i++) {
			if (names[i].toLowerCase().startsWith("d") && names[i].endsWith("a")) {
				System.out.println(names[i]);
			}
			if(names[i].toUpperCase().startsWith("t")&& names[i].endsWith("a")) {
				System.out.println(names[i]);
			}
		}

//		System.out.println(Arrays.toString(names));

	}

}
