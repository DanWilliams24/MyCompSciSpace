package com.example.daniel.mycompsciworkspace.CurrentProjects;

/**
 * Created by Daniel on 11/15/17.
 */

import java.util.Scanner;

public class Calculator {
    /***************************************INSTANCE VARIABLES***********************************/
    //Instance variables accessible everywhere
    public double myanswer, num1, num2;


    /***************************************CONSTRUCTORS*****************************************/
    //Constructor to initialize the instance variables
    Calculator(){
        num1 = 0;
        num2 = 0;
        myanswer = 0;
    }
    /***************************************METHODS*****************************************/
    //Method Menu is a void method that does not return a value
    public void Menu(){
        System.out.println( "1. Add two numbers \n"+

                "2. Subtract two numbers \n" +
                "3. Multiply two numbers \n" +
                "4. Divide two numbers \n" +
                "Make a selection");

    }
    //Technically accessors, but these are really helper methods
    public double Addition(double val1, double val2)
    { //Takes two Parameters: val1 , val2 and adds them

        return (val1 + val2);

    }
    public double Subtraction(double val1, double val2)
    { //Takes two Parameters: val1 , val2 and subtracts val2 from val1

        return (val1 - val2);

    }
    public double Multiplication(double val1, double val2)
    { //Takes two Parameters: val1 , val2 and multiplies them together

        return (val1 * val2);

    }

    public double Division(double val1, double val2)
    { //Takes two Parameters: val1 , val2 and divides val1 by val2 unless val2 is 0

        if (val2 != 0)
            return (val1 / val2);
        else
        {
            System.out.println ("Error in input data. Cannot divide by 0");
            return 0;
        }

    }


    /***************************************MAIN*****************************************/
    public static void main(String[] args) {
        //Instance of Scanner Object
        Scanner keyIn = new Scanner(System.in);

        // Create an instance of the class Calculator
        Calculator calc = new Calculator();

        //Prints out a menu to the output of the program, and prompts input from User
        calc.Menu();

        //stores input from user in choice
        int choice = keyIn.nextInt();

        //Tests to see which number the User inputted and acts accordingly.
        switch (choice)
        {
            case 1: { System.out.println("Enter the values to be summed");

                calc.num1 = keyIn.nextDouble();
                calc.num2 = keyIn.nextDouble();
                calc.myanswer = calc.Addition(calc.num1,calc.num2);
                System.out.println("Answer = " + calc.myanswer);

                break;
            }

            case 2: { System.out.println("Enter the values to be summed");

                calc.num1 = keyIn.nextDouble();
                calc.num2 = keyIn.nextDouble();
                calc.myanswer = calc.Subtraction(calc.num1,calc.num2);

                System.out.println("Answer = " + calc.myanswer);

                break;
            }

            case 3: { System.out.println("Enter the values to be summed");

                calc.num1 = keyIn.nextDouble();
                calc.num2 = keyIn.nextDouble();
                calc.myanswer =

                        calc.Multiplication(calc.num1,calc.num2);

                System.out.println("Answer = " + calc.myanswer);

                break;
            }

            case 4: { System.out.println("Enter the values to be summed");

                calc.num1 = keyIn.nextDouble();
                calc.num2 = keyIn.nextDouble();
                calc.myanswer = calc.Division(calc.num1,calc.num2);
                System.out.println("Answer = " + calc.myanswer);

                break;
            }
            default:{

                System.out.println("Error in Input Data");
            }
        }// end of switch case statement

    }// end of main method

}// end of class Calculator