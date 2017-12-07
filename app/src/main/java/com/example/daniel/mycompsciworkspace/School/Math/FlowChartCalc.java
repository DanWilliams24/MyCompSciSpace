package com.example.daniel.mycompsciworkspace.School.Math;

import java.util.Scanner;

/**
 * Created by tina on 11/3/17.
 */

public class FlowChartCalc {
    public static void main(String[] args){
        String operator = "";
        Scanner input = new Scanner(System.in);
        int num = 0;
        int operand = 0;
        num = input.nextInt();

        operator = input.next();

        if(operator.equals("=")){
            System.out.println(num);
        }else {
            switch (operator){
                case "/": operand = input.nextInt();
                    num = num / operand;
                    break;
                case "*":operand = input.nextInt();
                    num = num * operand;
                    break;
                case "+":operand = input.nextInt();
                    num = num + operand;
                    break;
                case "-":operand = input.nextInt();
                    num = num - operand;
            }
        }



    }
}
