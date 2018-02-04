package com.example.daniel.mycompsciworkspace.School.Situations;

import java.util.Scanner;

/**
 * Created by Daniel on 1/29/18.
 */

public class DivingProblem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float[][] data = new float[4][9];

        for(int i = 0; i < 4; i++){
            int maxPosition = 1;
            int minPosition = 1;
            float sum = 0;
            System.out.println("Enter Dive Difficulty:");
            float difficulty = input.nextFloat();
            if(difficulty >= 1.2 && difficulty <= 3.8){
                data[i][0] = difficulty;
            }else {
                throw new IllegalArgumentException("Number out of difficulty range");
            }

            for(int j = 1; j < 8; j++){
                System.out.println("Enter Judge " + j + " Score:");
                float score = input.nextFloat();
                if(score >= 0 && score <= 10){
                    data[i][j] = score;
                    if(score > data[i][maxPosition]){
                        maxPosition = j;
                    }
                    if(score < data[i][minPosition]){
                        minPosition = j;
                    }
                }else{
                    throw new IllegalArgumentException("Number out of score range");
                }
            }

            //Judges have all inputted their dives
            data[i][maxPosition] = 0;
            data[i][minPosition] = 0;

            for(int j = 1; j < 8; j++){
                sum += data[i][j];

            }
            data[i][8] = (sum*data[i][0])*0.6f;

        }

        for(int i = 0; i < 4; i++){
            int displayNum = i +1;
            System.out.println("Dive #" + displayNum + " Overall: " + String.format("%.2f",data[i][8]));
        }
    }
}
