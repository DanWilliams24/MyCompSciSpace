package com.example.daniel.mycompsciworkspace.School.DemoPrograms.Selection_Sort;

import java.util.ArrayList;

/**
 * Created by tina on 1/3/18.
 */

public class MainFunction {

    public static void main(String[] args){//FOR SELECTION SORT

        //Test 1
        int[] teamScore = {5,7,4,9,3,2,12,8,17,15};

        for(int element: teamScore){
            System.out.print(element + " ");
        }

        SelectionSort.sort(teamScore);

        System.out.println();
        for(int element: teamScore){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println();



        //Test 2
        String[] names = {"John","Susan", "Mary", "Asif", "Emil"};
        for(String element: names){
            System.out.print(element + " ");
        }

        SelectionSort.sort(names);

        System.out.println();
        for(String element: names){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println();




        //Test 3
        int[] values = {678,45,77,134,98,2,987,65};
        ArrayList<Integer> arr = new ArrayList<>(5);

        for(int element: values){
            System.out.print(element + " ");
        }

        SelectionSort.sort(values);

        System.out.println();
        for(int element: values){
            System.out.print(element + " ");
        }



    }


}
