package com.example.daniel.mycompsciworkspace.School;

/**
 * Created by Daniel on 10/16/17.
 */

public class Difference {
    public static void main(String[] args) {
        int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int greatest = data[0];
        int difference = 0;
        for (int i = 1; i < data.length; i++) {
            if (greatest < data[i]) {
                greatest = data[i];
                System.out.println(greatest);
            }

        }
        for (int i = 1; i < data.length; i++) {
            if (greatest - data[i] >= difference) {
                difference = greatest - data[i];
                System.out.println(data[i]);
                System.out.println("Diff: "+ difference);
            }
        }
        System.out.println("Largest Difference = " + difference);
    }
}
