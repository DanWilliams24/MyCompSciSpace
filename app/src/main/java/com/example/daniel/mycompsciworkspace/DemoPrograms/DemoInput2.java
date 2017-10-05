package com.example.daniel.mycompsciworkspace.DemoPrograms;

import java.util.Scanner;

/**
 * Created by tina on 10/4/17.
 */

public class DemoInput2 {

    public enum Days {
        Monday(1, "Monday"),
        Tuesday(2, "Tuesday"),
        Wednesday(3, "Wednesday"),
        Thursday(4, "Thursday"),
        Friday(5, "Friday"),
        Saturday(6, "Saturday"),
        Sunday(7, "Sunday"),
        TBD(0, "IDK");



        private int value;
        private String hidden;


        Days(int value, String hidden) {
            this.value = value;
            this.hidden = hidden;
        }
    }


    public static void main(String[] args){
        Days daySelected = Days.TBD;
        int number;

        Scanner keyIn = new Scanner(System.in);


        System.out.println("Enter the Number");
        number = keyIn.nextInt();

        if((number % 2) == 0){
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }





        System.out.println("Enter number 1-7(inclusive)");
        number = keyIn.nextInt();

        switch (number){
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                default: System.out.print("Number not between 1-7(inclusive)"); System.exit(1);
        }




    }



}
