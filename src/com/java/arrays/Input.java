package com.java.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        
    }
}