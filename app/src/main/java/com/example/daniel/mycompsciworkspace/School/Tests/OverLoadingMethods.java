package com.example.daniel.mycompsciworkspace.School.Tests;

/**
 * Created by Daniel on 11/19/17.
 */

public class OverLoadingMethods {
    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,32,5,6,7,54,34,5};
        System.out.println(max(arr));
        System.out.println(max(3,2,0,2));
    }

    public static int max(int...a){
        int max = a[0];
        for (int element: a) {
            if(element > max ){
                max = element;
            }
        }
        return max;
    }
}
