package com.example.daniel.mycompsciworkspace;

import java.util.Scanner;

/**
 * Created by tina on 9/30/17.
 */

public class CalculatorV2 {
    static Character ch;
    static Scanner input = new Scanner(System.in);
    static String text = " ";
    static Integer charCount = 0;
    static String[] expression;
    static Integer result;
    static Integer[] numbers;

    public static void main(String[] args){
        System.out.println("Enter Equation");
        text = input.nextLine();

        for(int i = 0; i < text.length(); i++){
            ch = text.charAt(i);
            charCount++;
            expression[i] = ch.toString();

        }

        if(text.length() % 2 != 0){
            System.out.println("Usage: X + X = ");
            System.out.println(expression.length);
            System.out.println(text.length());
            System.exit(0);
        }
        for(int i = 0; i < text.length(); i++){
            if(i % 2 != 0){
                System.out.println(i);
                System.out.println(i % 2);
                System.out.println(expression[i]);
                Integer num = Integer.valueOf(expression[i]);
                numbers[i] = num;

            }
        }

        switch (expression[1]){
            case "*": result = numbers[0] * numbers[1];
                break;
            case "/": result = numbers[0] / numbers[1];
                break;
            case "+": result = numbers[0] + numbers[1];
                break;
            case "-": result = numbers[0] - numbers[1];
                break;
        }
        System.out.println(result);







    }
}
