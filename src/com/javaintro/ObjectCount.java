package com.javaintro;

public class ObjectCount {

    // Static variable to count objects
    static int count = 0;

    // Constructor
  ObjectCount() {
	  count ++;
  }
  
    public static void main(String[] args) {

        // Creating multiple objects
        ObjectCount obj1 = new ObjectCount();
        ObjectCount obj2 = new ObjectCount();
        ObjectCount obj3 = new ObjectCount();
        ObjectCount obj4 = new ObjectCount();


        System.out.println("Total Object created:" + count);
    }
}


