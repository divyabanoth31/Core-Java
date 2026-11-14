package com.accessmodifiers01;

// Illegal modifier for the interface TestA2; only public & abstract are permitted
//private interface TestA2{
//	
//}
public class Private {

	private int id1;
	private String name;

	private void method() {
		System.out.println("method called");
	}

	public static void main(String[] args) {
		System.out.println("Main method started");

		Private t1 = new Private();

		System.out.println(t1.id1);
		System.out.println(t1.name);
		t1.method();

		System.out.println("Main method ended");

	}

	// Inner classes and interface
	private class TestA {

	}

	private interface in1 {

	}
}
