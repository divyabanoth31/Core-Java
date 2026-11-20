package com.javaintro;

import java.util.Scanner;

public class Logicalstatement4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
        int a = sc.nextInt();
        
        int result = (a < 0)? 0 : 1;
        System.out.println(result);
        
	}

}
