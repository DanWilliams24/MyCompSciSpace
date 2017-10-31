package com.example.daniel.mycompsciworkspace.ExtraCurricular;

/**
 * Created by tina on 10/30/17.
 */

public class NumberSort {


    public static void main(String[] args){
        int[] sort = {8,10,7,5,2,4,1,6};

        for(int i = 0; i < sort.length; i++) {
            for (int r = 0; r < sort.length - 1; r++) {
                if (sort[r] > sort[r + 1]) {
                    int temp = sort[r + 1];
                    sort[r + 1] = sort[r];
                    sort[r] = temp;
                }
            }
        }
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + " ");
        }
    }
}
