package com.example.daniel.mycompsciworkspace.School;
import java.util.Random;
import java.util.Scanner;

public class CrapsGame {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner input = new Scanner(System.in);

        int die1;
        int die2;
        int sum;
        int point = 0;
        boolean playerDidWin;
        boolean notDone;
        boolean isPointPhase;

        do {
            playerDidWin = false;
            isPointPhase = false;
            System.out.println("Starting Come Out Phase");
            System.out.println("Rolling...");

            die1 = generator.nextInt(6) + 1;
            die2 = generator.nextInt(6) + 1;
            sum = die1 + die2;
            System.out.println(sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Round Over");
                System.out.println("Starter Wins!");
                playerDidWin = true;
            } else if (sum == 7 || sum == 11) {
                System.out.println("Round Over");
                System.out.println("Other Player Wins!");
                playerDidWin = true;
            }else{
                System.out.println("come out roll is not a 2, 3, or 12");
            }
            while (!playerDidWin && !isPointPhase) {
                System.out.println("Rolling...");
                die1 = generator.nextInt(6) + 1;
                die2 = generator.nextInt(6) + 1;
                sum = die1 + die2;
                System.out.println(sum);

                if (!(sum == 2 || sum == 3 || sum == 12 || sum == 7 || sum == 11)) {
                    point = sum;
                    isPointPhase = true;
                    System.out.println("Starting Point Phase with: " + sum);
                }
            }
            while (isPointPhase) {
                System.out.println("Rolling...");
                die1 = generator.nextInt(6) + 1;
                die2 = generator.nextInt(6) + 1;
                sum = die1 + die2;
                System.out.println(sum);
                if (sum == point) {
                    System.out.println("Round Over");
                    System.out.println("Players Win!");
                    isPointPhase = false;
                } else if (sum == 7) {
                    System.out.println("Round Over");
                    System.out.println("Players Lose!");
                    isPointPhase = false;
                }
            }
            System.out.println("Play another Round? (true/false)");
            notDone = input.nextBoolean();
        }while (notDone);
        input.close();
    }
}
