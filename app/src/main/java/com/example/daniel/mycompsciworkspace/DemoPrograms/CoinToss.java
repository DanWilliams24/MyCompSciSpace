package com.example.daniel.mycompsciworkspace.DemoPrograms;

import java.util.Random;

/**
 * Created by tina on 10/30/17.
 */

public class CoinToss {
    //Class-public constant
    public static final int LIMIT = 5;

    public static void main(String[] args){
        Random randomGen = new Random();
        int counter = 1;

        while(counter <= LIMIT){
            System.out.println("Toss Number " + counter + ":");
            int toss = randomGen.nextInt(2);
            if(toss == 1){
                System.out.println("Heads");
            }else{
                System.out.println("Tails");
            }
            counter++;
        }//End of While Loop
    }//End of Main
}//End of Class
