package com.javaintro;

public class LoanManagement {

	String customer_Name;
	int loan_amount;
	int interest_Rate;
	int loantenure;
	
// formula ptr/100
	int calculateInterest(int interest_amount, int loantenure, int interest_Rate) {
	int 	simple_interest =(interest_amount * loantenure * interest_Rate ) / 100;
	System.out.println("simple_interest:"+simple_interest);
		return simple_interest;
	}

	// interesr + loan amount
	int calculateTotalAmount(int interest_Rate, int loan_amount) {
		int totalamountpayable =(interest_Rate + loan_amount);
		System.out.println("totalamountpayable:"+totalamountpayable);
		return totalamountpayable;
	}

	
	double calculateMonthlyEMI(int totalamountpayable) {
		double monthly_EMI = totalamountpayable / (5 * 12);
		System.out.println("monthly_EMI:"+ monthly_EMI);
		
		return monthly_EMI;

	}

	int displayLoanSummary(int loan_amount, int simple_interest) {
		int total_amount = ( simple_interest + loan_amount);
		System.out.println("total_amount:"+total_amount);
		return total_amount;
	}

	public static void main(String[] args) {
		LoanManagement l = new LoanManagement();
		l.customer_Name = "Divya";
		l.loan_amount = 100000;
		l.interest_Rate = 2;
		l.loantenure = 5;
		

		int interest=l.calculateInterest(10000, 5, 2);
		int total=l.calculateTotalAmount(interest, 10000);
		l.calculateMonthlyEMI(total);
		l.displayLoanSummary(total, interest);

	}

}
