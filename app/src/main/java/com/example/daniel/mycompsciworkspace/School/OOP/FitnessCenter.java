package com.example.daniel.mycompsciworkspace.School.OOP;

import java.util.Scanner;

/**
 * Created by tina on 11/13/17.
 */

public class FitnessCenter {
    public static final double RATE = 75.00;

    private String name;
    private int hours;
    private double fee;


    /***************************************CONSTRUCTORS*****************************************/
    public FitnessCenter(){
        name = "";
        hours = 0;
        fee = 0.00;
    }
    public FitnessCenter(String newName, int newHrs, double newFee){
            name = newName;
            hours = newHrs;
            fee = newFee;
    }

    public FitnessCenter(FitnessCenter other){
        name = other.name;
        hours = other.hours;
        fee = other.fee;
    }

    /***************************************METHODS*****************************************/
    public String toString(){
        return name + ": "+ hours + "," + fee;
    }


    public int inputTime(){
        System.out.println("Enter total number of hours");
        Scanner keyboard = new Scanner(System.in);
        hours = keyboard.nextInt();
        return hours;
    }


    private double calculateFee(int newHours){
        return newHours * RATE;
    }

    public void updateFee(){
        fee = calculateFee(hours);
    }

    public void outputBill(){

        System.out.println("**************************BILL******************************");
        if(!name.equals("")){
            System.out.println("Customer: \t" + this.name);
        }else{
            System.out.println("Customer: \t" + "Unknown");
        }
        System.out.println("Total Hours: \t" + this.hours);



        System.out.println("Fee Owed: \t" +this.fee);

    }
    /***************************************MAIN*****************************************/
    public static void main(String[] args){
        System.out.println("Welcome to the Fitness Center");
        FitnessCenter Member1 = new FitnessCenter();
        FitnessCenter Member2 = new FitnessCenter("Jane Blue", 5,25.00);

        Scanner input = new Scanner(System.in);
        System.out.println("Input Member name: ");
        FitnessCenter MemberNumber = new FitnessCenter(input.next(),5,25);

        System.out.println("Member 1: " + Member1);
        System.out.println("Member 2: " + Member2);


        FitnessCenter Member3 = new FitnessCenter("Sam L Green", 12,15.00);
        FitnessCenter Member4 = Member3;
        System.out.println("Member 3: " + Member3);
        System.out.println("Member 4: " + Member4);

        FitnessCenter Member5 = new FitnessCenter("Wendall Amber", 12,15.00);
        FitnessCenter Member6 = new FitnessCenter(Member5);

        System.out.println("Member 5: " + Member5);
        System.out.println("Member 6: " + Member6);

        System.out.println(Member2.inputTime());
        Member2.updateFee();
        Member2.outputBill();
        System.out.println("Thank you and see you next time");
    }
}

