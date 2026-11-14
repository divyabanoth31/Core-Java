package com.accessmodifiers01;

//public class Bank {
//	
//	 private void showBalance() {
//		 System.out.println("Your balance is 5000");
//	 }
//	 
//	 private void show() {
//		 showBalance();
//	 }
//
//	public static void main(String[] args) {
//		Bank b = new Bank();
//		b.show();
//	}
//
//}

//         public class Student {
//
//    private int marks;
//
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }
//
//    public int getMarks() {
//        return marks;
//    }
//
//    public static void main(String[] args) {
//
//        Student s = new Student();
//
//        s.setMarks(100);
//
//        System.out.println(s.getMarks());
//    }
//}



//    public class Student {
//    	
//    	private String name;
//    	private int rollno;
//    	
//    	
//    	public void setName ( String name, int rollno) {
//    		this.name = name;
//    		this.rollno = rollno;
//    	}
//    	
//    	public String getname() {
//    		return name;
//    	}
//    	
//    	public int getrollno() {
//    		return rollno;
//    	}
//    	
//    	
//    	public static void main (String args[]) {
//    		Student s = new Student();
//    		
//    		s.setName("divya", 101);
//    		
//    		System.out.println(s.getname());
//    		System.out.println(s.getrollno());
//   
//    		
//    	    }
//    }


//       public class Calculator {
//    	   
//    	   
//    	   private void multiple(int a, int b) {
//    		   System.out.println(a*b);
//    	   }
//    	   
//    	   public void calculate() {
//    		  multiple(10,20);
//    	   }
//    	   
//    	   
//    	   public static void main (String args[]) {
//    		   Calculator c = new Calculator();
//    		   c.calculate();
//    		   
//       }
//
//   }
       
       
          public class Account {
        	  
        	  private int balance = 1000;
        	  
        	  public void deposit(int amount) {
        		  balance = balance + amount;
        		  
        	  }
        	  
        	  public void displayBalance() {
        		  System.out.println(balance);
        	  }
        	  
        	  public static void main (String args[]) {
        	  
        		  Account a = new Account();
        		  
        		  a.deposit(500);
              a.displayBalance();
        		  
          }

      }













