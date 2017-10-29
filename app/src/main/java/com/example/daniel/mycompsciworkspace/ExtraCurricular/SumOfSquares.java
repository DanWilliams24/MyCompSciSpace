package com.example.daniel.mycompsciworkspace.ExtraCurricular;

/**
 * Created by tina on 9/23/17.
 */

public class SumOfSquares {
    public static void main(String[] args){
        Integer [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};
        Integer square = 0;
        Integer sum = 0;
        for (Integer number: numbers) {

            square = number * number;
            sum = sum + square;
        }

        System.out.println("The Sum: " + sum);
    }
}
