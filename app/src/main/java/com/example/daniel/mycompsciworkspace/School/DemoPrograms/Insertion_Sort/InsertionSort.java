package com.example.daniel.mycompsciworkspace.School.DemoPrograms.Insertion_Sort;

/**
 * Created by tina on 1/4/18.
 */


public class InsertionSort {

    public static void inSort(int ...a) {
        for(int index = 1; index <= a.length - 1; index ++) {
            int current = a[index];
            int location = index;
            while(location > 0 && a[location-1] > current) {
                a[location] = a[location - 1];
                location --;
                a[location] = current;
            }
        }
    }



    public static void sort(String...strings){
        String testedStr = "aaaaaa";
        int[] lexArr = convertStrs(strings);

        inSort(lexArr);

        for(int i = 0; i < strings.length; i++){
            for(int j = 0; j < strings.length; j++){
                if(testedStr.compareTo(strings[i]) == lexArr[j]){
                    String temp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = temp;
                }
            }

        }
    }

    public static int[] convertStrs(String...strings){
        String testedStr = "aaaaaa";
        int[] lexArr = new int[strings.length];

        for(int i = 0; i < strings.length; i++){
            lexArr[i] = testedStr.compareTo(strings[i]);
        }

        return lexArr;
    }



}

