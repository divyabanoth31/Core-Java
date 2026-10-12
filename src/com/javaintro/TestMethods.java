package com.javaintro;

public class TestMethods {
	
	// parameters no return type
	void add (int a, int b) {
		System.out.println("Addition method called");
		System.out.println(a+b);
	}
	
	void sub (int c, int d) {
		System.out.println("Subtraction :" + (c-d));
	}
	
	void greet(String name) {
	    System.out.println("Hello " + name);
	}
	
    void student(String name) {
    	System.out.println(name);
    }
    
    
	// no parameter no return type
	static void welcome() {
		System.out.println("welcome to Java");
	}
	
	static void display() {
		System.out.println("Name : divya");
		System.out.println("Age : 22");
		System.out.println("City : Hyderabad");
	}
	
	void getEmployeesalary (double salary) {
		System.out.println("salary :"+ salary);
		
	}
	void greet () {
		System.out.println("Iam learning java");
	}
	
	// return type no parameters
	static int student1 () {
		int age = 22;
		System.out.println("age:"+age);
		return age;
	}
	
	String  name () {
		String collegeName = "mrec";
		System.out.println("College name:"+ collegeName);
		return collegeName;
	}
	
	int mul() {
		int a = 20;
		int b = 5;
		int sum = a*b;
		System.out.println("multiplication:"+ (sum));
		return sum;
	}
	
	
	int display1() {
		int num = 10;
		int result =  num * num; //square
		int sum1 = num * num * num ;// cube
		int a = 10;
		int b = 20;
		int c = 30;
		int sum2 = (a+b+c) / 3; // average 
		System.out.println(result);
		System.out.println(sum1);
		System.out.println(sum2);
		return num;
	}
	
	//parameters with return type
	int emp(int a) {
		int age = a;
		System.out.println(age);
		return age;
	}
	
	String emp1(String name) {
	System.out.println(name);
	return name;
	
   }
	
	int first (int a, int b) {
		return a;
	}
	
	int second (int a1, int b1) {
		return b1;
	}
	
	int getmarks (int marks) {
		return marks;
	}
	
	

	public static void main(String[] args) {
		 TestMethods t = new  TestMethods();
		 t.add(10, 5);
		 t.sub(30, 7);
		 welcome();
		 display();
		 t.greet("divya");
		 t.getEmployeesalary(10000);
		 t.greet();
		 t.student("Arun");
		 student1();
		 t.name();
		 t.mul();
		 t.display1();
		 int age = t.emp(22);// calling this with parameter and with return type
	     String name = t.emp1("Trisha");// calling this with parameter and with return type
	     System.out.println("First number: " + t.first(10, 50)); // print statement of first 
	     System.out.println("Second number: " + t.second(79, 69));
	     System.out.println("Marks: " + t.getmarks(100));
	     t.first(10,50); 
//	     t.second(79, 69);// calling
	     t.getmarks(100);

	}

}
