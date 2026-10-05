package com.javaintro;

public class TestDemo1 {
	
	void add() {
		int a = 20;
		int b = 10;
		System.out.println("Addition_result:"+(a+b));	
	}
    
	void sub() {
		int c = 25;
		int d = 15;
		System.out.println("Subtraction_result:"+( c-d));
	}
  
	void mul() {
		int a = 12;
		int b = 10;
		System.out.println("multiplication_result:"+(a*b));
	}
	
	void div() {
		int a = 10;
		int b = 5;
		int result = a/b;
		System.out.println("Division_result:"+result);
	}
	public static void main(String[] args) {
		 TestDemo1 t = new  TestDemo1();
		 t.add();
		 
		 t.sub();
		 t.mul();
		 t.div(); 
		 
	}

}
