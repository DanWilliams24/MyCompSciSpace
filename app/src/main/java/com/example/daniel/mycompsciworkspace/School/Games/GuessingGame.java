package com.example.daniel.mycompsciworkspace.School.Games;


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

    public static int runTest(int upper, int lower,int key) {
        return binarySearch(createRange(upper, lower), key);
    }

    public static int guess(int randomNumber, int guess){

        if(guess == randomNumber){
            return 0;
        }else if(guess > randomNumber){
            System.out.println("Incorrect! Too High");
            return 1;
        }else if(guess < randomNumber){
            System.out.println("Incorrect! Too Low");
            return -1;
        }
        return 1;
    }

    public static int[] createRange(int lowermost,int uppermost){
        int[] arr = new int[uppermost];
        int count =0;
        for (int i = lowermost; i < uppermost; i++) {
            arr[count] = i;
            count++;
        }
        return arr;
    }

    public static int binarySearch(int[] a, int key) {

        if (a.length == 0) {
            return -1;
        }
        int low = 0;
        int high = a.length-1;
        int tries = 0;
        while(low <= high) {
            int middle = (low+high) /2;

            if (guess(key,a[middle]) == -1){
                low = middle +1;
            } else if (guess(key,a[middle]) == 1){
                high = middle -1;
            } else { // The element has been found
                return tries;
            }
            tries++;
        }
        return -2;
    }
}
