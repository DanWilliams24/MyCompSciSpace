package com.example.daniel.mycompsciworkspace.School.DemoPrograms.Selection_Sort;

/**
 * Created by tina on 1/3/18.
 */

public class SelectionSort {
    public static void sort(int...arr){
        for(int index = arr.length -1; index > 0; index--){
            int position = UtilityClass.positionOfMaxvalue(index,arr);

            int temp = arr[index];
            arr[index] = arr[position];
            arr[position] = temp;
        }
    }


    public static void sort(String...strings){
        String testedStr = "aaaaaa";
        int[] lexArr = convertStrs(strings);

        sort(lexArr);

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
