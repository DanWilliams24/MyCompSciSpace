package com.example.daniel.mycompsciworkspace.School;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by tina on 10/30/17.
 */

public class DiceRoll {
    public static void main(String[] args){
        int dieToss,One = 0,Two = 0,Three = 0,Four = 0,Five = 0,Six = 0;
        int randNumber;

        Random generator = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Trials: ");
        dieToss = input.nextInt();

        for(int i = 0; i < dieToss; i++){
           randNumber = generator.nextInt(6) + 1;
           //System.out.println(randNumber);
           switch(randNumber){
               case 1:One++;
                   break;
               case 2:Two++;
                   break;
               case 3:Three++;
                   break;
               case 4:Four++;
                   break;
               case 5:Five++;
                   break;
               case 6:Six++;
                   break;
           }
        }
        System.out.println("=======================Results===========================");
        System.out.println("Die Faces \t1\t2\t3\t4\t5\t6");
        System.out.println("Frequency \t"+One+"\t"+Two+"\t"+Three+"\t"+Four+"\t"+Five+"\t"+Six+"\t");

    }
}
