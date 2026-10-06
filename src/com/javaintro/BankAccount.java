package com.javaintro;

public class BankAccount {
	static int balance = 1000;
	
	int deposit() {
		int amount = 500;
		balance=balance+amount;
		return balance;	
	}
	
	void withdraw() {
		int amount1 = 300;
		balance = balance-amount1;
		System.out.println("withdraw:"+balance);
		
	}
	void display() {
		System.out.println(balance);
	}
	public static void main(String[] args) {
		BankAccount  b = new BankAccount();
		b.deposit();
		b.display();
        b.withdraw();
	}

}
