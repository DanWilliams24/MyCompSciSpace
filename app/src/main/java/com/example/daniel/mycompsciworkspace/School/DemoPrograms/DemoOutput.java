package com.example.daniel.mycompsciworkspace.School.DemoPrograms;

/**
 * Created by Daniel on 10/4/17.
 */

public class DemoOutput {
    public static final double RATE = 0.5; //Constant



    public static void main(String[] args){ // Main Method
        System.out.println("Welcome to Java Programming ");
        System.out.println("Java Program Demonstration ");

        String name = "John Happy";
        int accNumber = 27153;
        double accBalance = 100.00;
        double accInterest;


        accInterest = accBalance * RATE;
        System.out.print("Name: " + name);
        System.out.print("\t Account Number: " + accNumber);
        System.out.print("\nBalance: ");
        System.out.printf("$ % 6.2f", accBalance);
        System.out.print("\t Interest:" + accInterest);
    }
}
