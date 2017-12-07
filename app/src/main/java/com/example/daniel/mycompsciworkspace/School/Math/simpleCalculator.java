package com.example.daniel.mycompsciworkspace.School.Math;
import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        String operator;
        int firstOperand;
        int secondOperand;
        int result = 0;
        boolean isDone = false;
        Scanner input = new Scanner(System.in);

        //Begin Processing
        System.out.println("Input first Number");
        firstOperand = input.nextInt();
        System.out.println("Input operator");
        operator = input.next();

        if(operator.equalsIgnoreCase("=")){
            isDone = true;
        }
        System.out.println("Input number");
        secondOperand = input.nextInt();
        //Validate the operator and calculate answer
        switch (operator) {
            case "*":result = firstOperand * secondOperand;
                break;
            case "/":result = firstOperand / secondOperand;
                break;
            case "+":result = firstOperand + secondOperand;
                break;
            case "-":result = firstOperand - secondOperand;
                break;
            default: System.err.println("Could not identify operator: " + operator);
        }

        while(isDone == false){
            System.out.println("Input operator");
            operator = input.next();
            if(operator.equalsIgnoreCase("=")){
                isDone = true;
                continue;
            }

            System.out.println("Input number");
            secondOperand = input.nextInt();
            switch (operator) {
                case "*":result = result * secondOperand;
                    break;
                case "/":result = result / secondOperand;
                    break;
                case "+":result = result + secondOperand;
                    break;
                case "-":result = result - secondOperand;
                    break;
                default: System.err.println("Could not identify operator: " + operator);
            }
        }
        System.out.print("Answer: "+ result);
        input.close();
        //End of Processing
    }
}