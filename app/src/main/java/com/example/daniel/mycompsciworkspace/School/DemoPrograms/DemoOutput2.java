package com.example.daniel.mycompsciworkspace.School.DemoPrograms;

/**
 * Created by Daniel on 10/4/17.
 */

public class DemoOutput2 {
    public static void main(String[] args){
        System.out.println("This Java Programming demonstrates outputting formatted data ");


        double cost = 62.5;
        String book = "Language for Living";

        System.out.println("Demo Output 1");
        System.out.print("$");
        System.out.printf("%6.2f", cost);
        System.out.println("\t Thank you");

        System.out.println("\nDemo Output");
        System.out.printf("$ % 6.2f for each copy of %s", cost, book);

        System.out.println("\tThank you");
    }





}
