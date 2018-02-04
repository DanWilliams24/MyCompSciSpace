package com.example.daniel.mycompsciworkspace.School.DemoPrograms;

import java.util.ArrayList;


/**
 * Created by Danile on 1/16/18.
 */

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(15);
        list.add("Wilson, John");
        list.add("Annan, Thomas");
        list.add("Manning, Alex");
        list.add("Branday, John");
        list.add("Smittens, Karaha");


        for (String element: list) {
            System.out.println(element);
        }

        list.add(2,"Goddard, Fay");

        System.out.println("Size: " + list.size());

        list.set(list.size()-1,"Brand, Brandon");
        list.add(list.size()-1,"Brand, Boarders");


        for (String element: list) {
            System.out.println(element);
        }
        sort(list);
        System.out.println();
        System.out.println("Sorted List:");
        for (String element: list) {
            System.out.println(element);
        }
    }


    public static void sort(int...arr){
        for(int index = arr.length -1; index > 0; index--){
            int position = positionOfMaxvalue(index,arr);

            int temp = arr[index];
            arr[index] = arr[position];
            arr[position] = temp;
        }
    }


    public static void sort(ArrayList<String> listOfStr){
        String testedStr = "aaaaaa";
        int[] lexArr = convertStrs(listOfStr);

        sort(lexArr);

        for(int i = 0; i < listOfStr.size(); i++){
            for(int j = 0; j < listOfStr.size(); j++){
                if(testedStr.compareTo(listOfStr.get(i)) == lexArr[j]){
                    String temp = listOfStr.get(j);

                    listOfStr.set(j,listOfStr.get(i));
                    listOfStr.set(i,temp);
                }
            }

        }
    }

    public static int[] convertStrs(ArrayList<String> strings){
        String testedStr = "aaaaaa";
        int[] lexArr = new int[strings.size()];

        for(int i = 0; i < strings.size(); i++){
            lexArr[i] = testedStr.compareTo(strings.get(i));
        }

        return lexArr;
    }

    public static int positionOfMaxvalue(int limit, int...a){
        if(a.length == 0){
            System.out.println("Error! Array list is empty");
            System.exit(0);
        }
        int largest = a[0]; int position = 0;
        for(int index = 0; index <= limit; index++){
            if(a[index] < largest){
                largest = a[index];
                position = index;
            }
        }
        return position;
    }
}
