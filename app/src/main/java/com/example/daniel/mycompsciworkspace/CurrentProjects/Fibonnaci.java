package com.example.daniel.mycompsciworkspace.CurrentProjects;

import java.util.Scanner;

/**
 * Created by Daniel on 11/27/17.
 */

public class Fibonnaci {

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
       return fibonacci(n-1) + fibonacci(n -2);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n");
        fibonacci(input.nextInt());
    }
}
