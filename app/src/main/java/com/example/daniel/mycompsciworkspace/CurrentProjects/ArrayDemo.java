package com.example.daniel.mycompsciworkspace.CurrentProjects;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] score = {120,16,54,41,33};

        //#1
        System.out.println("NUMBER 1");
        int total = 0;
        for(int index: score ){
            total += index;
        }
        System.out.println(total);

        //#2
        System.out.println("NUMBER 2");
        int max = 0;
        max = score[0];
        for(int i = 1; i < score.length; i++){
            if(max < score[i]){
                max = score[i];
            }
        }
        System.out.println(max);


        //#3
        System.out.println("NUMBER 3");
        Scanner input = new Scanner(System.in);
        System.out.println("Input search value:");
        int value = input.nextInt();

        for(int i = 0; i < score.length; i++){
            if(value == score[i]){
                System.out.println("Value: " + value + " is present at index: " + i);
                i = score.length;
            }
            if(i == score.length -1 && value != score[i]){
                System.out.println("Value: "+ value + " is not present at any index of the array");
            }
        }

        //4
        System.out.println("NUMBER 4");
        for(int i = 0; i < score.length; i++){
            score[i] = 2*score[i];
            System.out.println(score[i]);
        }

        //5
        int numsEqual = 0;
        int[] p = {0,1,2,3,4,5,6,7,8,9};
        int[] q = {0,1,2,3,4,5,6,7,8,9};
        if(p.length == q.length){
            for(int i = 0; i < p.length; i++){
                if(p[i] == q[i]) {
                    numsEqual++;
                }else{
                    System.out.println(p[i] + " of the array p and " + q[i] + " of the array q are unequal at index " + i);
                }
            }
            if(numsEqual == p.length){
                System.out.println("Arrays are equal");
            }else{
                System.out.println("Arrays are not equal");
            }
        }


    }
}