package com.example.daniel.mycompsciworkspace.School.DemoPrograms.Insertion_Sort;

/**
 * Created by tina on 1/4/18.
 */


public class MainFunction { //FOR INSERTION SORT

    public static void main (String[]args) {
        int [] teamScore = {5, 7, 4, 9, 3, 2, 12, 8, 17, 15};

        //displaying before sort
        for (int element: teamScore) {
            System.out.print(element + " ");
        }

        //display after sort
        System.out.println();
        InsertionSort.inSort(teamScore);
        for (int element: teamScore) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println();

        int [] marks = {18, 7, 15, 8, 13};

        //display before sort
        System.out.println();
        for (int element: marks) {
            System.out.print(element + " ");
        }

        //display after sort
        System.out.println();
        InsertionSort.inSort(marks);
        for (int element: marks) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println();



        //Test 2
        String[] names = {"John","Susan", "Mary", "Asif", "Emil"};
        for(String element: names){
            System.out.print(element + " ");
        }

        InsertionSort.sort(names);

        System.out.println();
        for(String element: names){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println();




        //Test 3
        int[] values = {678,45,77,134,98,2,987,65};

        for(int element: values){
            System.out.print(element + " ");
        }

        InsertionSort.inSort(values);

        System.out.println();
        for(int element: values){
            System.out.print(element + " ");
        }
        System.out.println();



        int var = 0;
        int last = 15;
        int result = (var + last)/2;
        System.out.println(result);

    }

}

