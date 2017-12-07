package com.example.daniel.mycompsciworkspace.CurrentProjects;

/**
 * Created by tina on 12/7/17.
 */

public class HelloWorld {


    private static void increment (int n) {
        n = n + 1;
        System.out.println("Value of n in method increment: " + n);
        }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Value of n before call to method: " + n);
        increment(n);
        System.out.println("Value of n after call to method: " + n);
    }

}
