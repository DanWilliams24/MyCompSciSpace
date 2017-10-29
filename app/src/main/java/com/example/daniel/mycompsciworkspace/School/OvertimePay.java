package com.example.daniel.mycompsciworkspace.School;

import java.util.Scanner;

/**
 * Created by Daniel on 10/11/17.
 */

public class OvertimePay {
    public static void main(String[] args){
        //Initialization
        Integer id;
        Double hours;
        final Integer RATE = 10;
        Double pay = 0.00;
        Double overTimePay = 0.00;
        Scanner input = new Scanner(System.in);

        //Begin Processing
        System.out.println("Enter 5-Digit Worker ID: ");
        id = input.nextInt();
        if(id < 9999 || id > 99999){
            System.err.println("Error: Id needs to be 5-digits.");
            System.exit(1);
        }
        System.out.println("Enter hours worked per week: ");
        hours = input.nextDouble();

        if(hours <= 35){
            pay = hours * 10;

        }else if(hours > 35 && hours <= 60){
            pay = 35.0 * RATE;
            hours = hours - 35;

            overTimePay = hours * (RATE*1.5);
        } else if (hours > 60) {
            pay = 35.0 * RATE;
            hours = hours - 35;
            overTimePay = 25 * (RATE*1.5);
            hours = hours -25;
            overTimePay = overTimePay + (hours * (RATE*2));
        }
        System.out.println("Worker Identification: " + id);
        System.out.println("Regular Pay: $" + pay);
        System.out.println("Overtime Pay: $" + overTimePay);

        input.close();
        System.out.println("End Of Processing");
        //End of Processing
    }

}
