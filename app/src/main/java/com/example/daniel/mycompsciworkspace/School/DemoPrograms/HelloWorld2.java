package com.example.daniel.mycompsciworkspace.School.DemoPrograms;

/**
 * Created by tina on 12/7/17.
 */


public class HelloWorld2 {
    private static int increment (int n)
    {
        n = n + 1;
        System.out.println("Value of n in method increment: " + n);
        return n;
    }

    public static void main(String[] args)
    {
        int n = 7;
        System.out.println("Value of n before call to method: " + n);
        System.out.println("Value of n after call to method: " + increment(n));
    }
}
