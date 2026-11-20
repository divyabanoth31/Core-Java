package com.javaintro.loops;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		 int n = Sc.nextInt();

	        int sum = 0;
	        int temp = n;
	        

	        while (temp > 0 && temp < 9) {
	        	
                int rem = temp % 10;
                sum = sum + rem;
                temp = temp / 10;
              
            }
         
         System.out.println(temp);
        if (temp == 1) {
            System.out.println(n + " is a Magic Number");
        } else {
            System.out.println(n + " is not a Magic Number");
        }
	}

}
