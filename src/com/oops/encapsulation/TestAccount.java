package com.oops.encapsulation;

public class TestAccount {

	public static void main(String[] args) {
		
		Account a = new Account();
		
//		System.out.println(a);
		Account a1 = new Account();
		
		a.setAccountNumber(123456);
		System.out.println("Account Number is:"+ a.getAccountNumber());
		
		a.setBalance(10000);
		System.out.println("Balance is:"+a.getBalance());
		
		a.setName("Divya");
		System.out.println("Customer Name is:"+a.getName());
		
		System.out.println("----------------------------");
		
		
		a1.setAccountNumber(234564);
		System.out.println("Account Number is:"+ a1.getAccountNumber());
		
		a1.setBalance(20000);
		System.out.println("Balance is:"+ a1.getBalance());
		
		a1.setName("Trisha");
		System.out.println("Customer Name is:"+ a1.getName());
		
		
		
		
		
//		a.accountNumber = 123456;
//		a.balance = 10000;
//		a.name = "Divya";
//		
//		System.out.println("Account Number is:"+ a.accountNumber);
//		System.out.println("Current Balance is:"+ a.balance);
//		System.out.println("Customer Name is:"+ a.name);



	}

}
