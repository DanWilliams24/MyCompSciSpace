package com.example.daniel.mycompsciworkspace.ExtraCurricular.others;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Daniel on 11/6/17.
 */

public class LFind {
    static int tries = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;
        int[] arr = {1,4,6,7,10,17,21,30,32};
        int[] score = {120,16,54,41,33};
        System.out.println("Enter K");
        k = input.nextInt();
        System.out.println(find(k,arr));
        System.out.println(find(k,score));

    }
    public static int find(int k, int[] arr){
        tries++;
        int middle = arr[(arr.length/2) -1];
        if(middle < k ){
            int[] newArray = Arrays.copyOfRange(arr,middle+1, arr.length-1);
            find(k,newArray);
        }else if(middle > k){
            int[] newArray = Arrays.copyOfRange(arr,0, middle-1);
            find(k,newArray);
        }else if(middle == k){
            System.out.println("Found number in array");
            return tries;

        }else if(tries > 3){
            System.out.println("Did not number in array");
            return tries;
        }

        return tries;
    }
}
