package com.javaintro;

import java.util.Scanner;

public class Logicalstatement5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your order");
		String item = sc.next();

		System.out.println("Enter the Quantity");
		int quantity = sc.nextInt();
		
		
		int total_price = 0;
		
		switch(item) {
		case  "1":
			System.out.println("Pizza:");
			int price=200;
			System.out.println(200+"rs");
			System.out.println("total_price "+ price*quantity);
            System.out.println("quantity:"  + quantity );
			break;
		
		case "2":
			System.out.println("Burger");
			int price1=120;
			System.out.println(120+"rs");
			System.out.println("total_price "+ price1*quantity);
            System.out.println("quantity:"  + quantity );
		break;
		
		case "3":
			System.out.println("Biryani");
			int price2=120;
			System.out.println(180+"rs");
			System.out.println("total_price "+ price2*quantity);
            System.out.println("quantity:"  + quantity );
		break;
		
		case "4":
			System.out.println("Noodles");
			int price3=120;
			System.out.println(100+"rs");
			System.out.println("total_price "+ price3*quantity);
            System.out.println("quantity:"  + quantity );
		break;	
		
	    default:
	    	    System.out.println("selected item is not there");
	  }	


	}

}
