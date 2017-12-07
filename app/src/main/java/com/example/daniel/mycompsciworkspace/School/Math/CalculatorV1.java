package com.example.daniel.mycompsciworkspace.School.Math;

import java.util.Scanner;

/**
 * Created by Daniel on 9/30/17.
 */


public class CalculatorV1 {


    //Variables declared global so it can be used between methods
    static String operator;
    static double firstOperand;
    static double secondOperand;
    static double result;
    static boolean isDone = false;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Takes first number and runs the calculate(int) on it.
        System.out.println("Input first Number");
        firstOperand = input.nextInt();
        calculate(firstOperand);

        //Once the new result is computed with the first call of calculate(int) the loop starts
        //and the new result is used as a parameter.
        while(isDone == false){
            calculate(result);
        }

        //Print the final result
        System.out.print("Answer: "+ result);
        input.close();
    }
    //This method takes a integer and returns an integer
    public static double calculate(double newOperand) {
        System.out.println("Input operator");
        operator = input.next();

        //When the user puts in an "=" the past result is returned,
        //and the while condition is retested and found to be false, stopping the loop.
        if(operator.equalsIgnoreCase("=")){
            isDone = true;
            return result;
        }

        System.out.println("Input number");
        secondOperand = input.nextDouble();
        //Validate the operator and calculate answer
        switch (operator) {
            case "*":result = newOperand * secondOperand;
                break;
            case "/":result = newOperand / secondOperand;
                break;
            case "+":result = newOperand + secondOperand;
                break;
            case "-":result = newOperand - secondOperand;
                break;
            case "^":result = Math.pow(newOperand , secondOperand);
                break;
            case "cos": result = Math.cos(secondOperand);
                break;
            default: System.err.println("Could not identify operator: " + operator);

            }
        // return result to be used again in the loop
        return result;
    }
}
