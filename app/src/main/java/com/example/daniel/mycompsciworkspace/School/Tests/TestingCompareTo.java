package com.example.daniel.mycompsciworkspace.School.Tests;

/**
 * Created by tina on 12/14/17.
 */

public class TestingCompareTo {



    static String[] names = {"John","Susan","Mary", "Asif", "Emil"};
    static String test = "z";
    public static int[] sortArr(String...arr){

        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            String element = arr[i];
            newArr[i] = test.compareTo(element);
        }


        return newArr;
    }



    public static void main(String[] args){
        int[] numbers = sortArr(names);
        for (int element: numbers) {
            System.out.println(element);
        }

    }
}
