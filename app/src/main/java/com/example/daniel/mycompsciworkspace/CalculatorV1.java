package com.example.daniel.mycompsciworkspace;

import java.util.Scanner;

/**
 * Created by tina on 9/30/17.
 */

public class CalculatorV1 {
    static String operator;
    static String
    static Integer firstOperand;
    static Integer secondOperand;
    static Integer result;
    static Boolean isDone;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first Number");
        firstOperand = input.nextInt();
        result = firstOperand;
        do {

            System.out.println("Input operator");
            operator = input.next();

            System.out.println("Input number");
            secondOperand = input.nextInt();
            switch (operator) {
                case "*":result = firstOperand * secondOperand;
                    break;
                case "/":result = firstOperand / secondOperand;
                    break;
                case "+":result = firstOperand + secondOperand;
                    break;
                case "-":result = firstOperand - secondOperand;
                    break;
                case "=":isDone = true;
                    break;
            }
        }while(isDone == true);


        System.out.println(firstOperand + operator + secondOperand + "=");
        System.out.print(result);

    }
}
