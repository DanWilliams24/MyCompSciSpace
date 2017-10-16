package com.example.daniel.mycompsciworkspace;


import java.util.Scanner;

/**
 * Created by Daniel on 10/10/17.
 */

public class MusicGrade {
    public static void main(String[] args){
        //Initialization
        String standing;
        String grade;
        Integer id;
        Integer mark;
        Scanner input = new Scanner(System.in);

        //Begin Processing
        System.out.println("Enter Student ID: ");
        id = input.nextInt();

        if(id < 99999 || id > 999999){
            System.out.println("Id needs to be 6-digits.");
            System.exit(1);
        }
        System.out.println("Enter student mark: ");
        mark  = input.nextInt();
        if(mark > 100){
            System.out.println("You cannot exceed 100 marks, reducing marks to 100");
        }
        if( mark <= 49){
            standing = "Fail";
            grade = "F";
        }else if(mark <= 65){
            standing = "pass";
            grade = "C";
        }else if(mark <= 79) {
            standing = "credit";
            grade = "B";
        }else {
            standing = "distinction";
            grade = "A";
        }

        System.out.println("Your Id: " + id);
        System.out.println("Your grade: " + grade);
        System.out.println("Your Standing: " + standing);
        input.close();
        System.out.println("End Of Processing");
        //End of Processing
    }
}
