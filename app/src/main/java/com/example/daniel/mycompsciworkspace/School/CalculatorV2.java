package com.example.daniel.mycompsciworkspace.School;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Daniel on 9/30/17.
 */

public class CalculatorV2 {
    static Character ch;
    static Scanner input = new Scanner(System.in);
    static String text = " ";
    static Integer charCount = 0;
    static ArrayList<Integer> expression = new ArrayList();
    static Integer result;
    static Integer[] numbers;
    static ArrayList<String> allOperators = new ArrayList();
    static String add = "\\+";
    static String subtract = "-";
    static String multiply = "\\*";
    static String divide = "/";
    static ArrayList<String> AvailableOps = new ArrayList();

    public static ArrayList<String> getAvailableOps() { //If new operators are added, make sure to update this getter.
        AvailableOps.add("Addition: +");
        AvailableOps.add("Subtraction: -");
        AvailableOps.add("Multiplication: *");
        AvailableOps.add("Division: /");
        return AvailableOps;
    }

    public static void main(String[] args){
        getAvailableOps();
        System.out.println("Enter Equation");
        text = input.nextLine();
        Scanner scanner = new Scanner(text);

        if(scanner.findInLine("") != null){
            allOperators.add(scanner.findInLine(add));
            System.out.println(allOperators);

        } else if(scanner.findInLine(subtract) != null){
            allOperators.add(scanner.findInLine(subtract));
            allOperators.add(scanner.findInLine(subtract));
            System.out.println(allOperators);

        }else if(scanner.findInLine(multiply) != null){
            allOperators.add(scanner.findInLine(multiply));
            System.out.println(allOperators);

        }else if(scanner.findInLine(divide) != null){
            allOperators.add(scanner.findInLine(divide));
            System.out.println(allOperators);

        }else{
            System.out.println("ERROR: UNKNOWN OPERATION");
            System.out.println("Available Operators:");
            System.out.println(AvailableOps);
            System.exit(2);
        }




        for(int i = 0; i < text.length(); i++){
            ch = text.charAt(i);
           // charCount++;
           expression.add(Character.getNumericValue(text.charAt(i)));

        }
        System.out.println(expression);
        switch (allOperators.get(0)){
            case "*": result = expression.get(0) * expression.get(2);
                System.out.println(expression.get(0) + "*" + expression.get(2));
                break;
            case "/": result = expression.get(0) / expression.get(2);
                System.out.println(expression.get(0) + "/" + expression.get(2));
                break;
            case "+": result = expression.get(0) + expression.get(2);
                System.out.println(expression.get(0) + "+" + expression.get(2));
                break;
            case "-": result = expression.get(0) - expression.get(2);
                System.out.println(expression.get(0) + "-" + expression.get(2));
                break;
        }


        if(text.length() % 2 != 0){
            System.out.println("Usage: X + X = ");
            System.out.println(expression);
            System.out.println(text.length());
            System.exit(1);
        }
        System.out.println(result);



    }
}
