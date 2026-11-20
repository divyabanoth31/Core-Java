package com.javaintro;

public class Cookies {
	
	public static void main(String[] args) {
		// price
		int chocolateprice = 15;
		int cookiesprice = 10;
		
		// purchase
		int chocolate = 10;
		int cookies = 5;
		
		// Totalmoney
		int totalmoney = 450;
		
		int chocolateCost = chocolateprice *chocolate;
	    int cookieCost =cookiesprice * cookies;

	    int totalCost = chocolateCost + cookieCost;
		int RemainingCost = totalmoney - totalCost;
		
		 System.out.println("Chocolate cost =" + chocolateCost);
	     System.out.println("Cookie cost =" + cookieCost);
	     System.out.println("Total cost =" + totalCost);
	     System.out.println("Remainingmoney =" + RemainingCost);
	     
	}
	
}	


	
	

	
	
	