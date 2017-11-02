package com.example.daniel.mycompsciworkspace.CurrentProjects;


import java.util.Random;
import java.util.Scanner;
/**
 * Created by Daniel on 10/28/17.
 */


public class GuessingGame {
    public static void main(String[] args){
        int randomNumber,guess;
        int tries = 0;
        int tooHigh = 0;
        int tooLow = 0;
        Random generator = new Random();
        Scanner input = new Scanner(System.in);
        randomNumber = generator.nextInt(10)+1;


        do {
            System.out.println("Guess the number between 1-10");
            guess = input.nextInt();
             tries++;
            if(guess == randomNumber){
                System.out.println("You guessed correctly! Great Job!");
                System.out.println("=======================Results===========================");
                System.out.println("Total Number of Tries: " + tries);
                System.out.println("Guesses too High: " + tooHigh);
                System.out.println("Guesses too Low: " + tooLow);
            }else if(guess > randomNumber){
                System.out.println("Incorrect! Too High");
                tooHigh++;
            }else if(guess < randomNumber){
                System.out.println("Incorrect! Too Low");
                tooLow++;
            }

        } while(!(guess == randomNumber));
    }
}
