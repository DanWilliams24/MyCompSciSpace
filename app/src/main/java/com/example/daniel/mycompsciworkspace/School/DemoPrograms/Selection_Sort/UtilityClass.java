package com.example.daniel.mycompsciworkspace.School.DemoPrograms.Selection_Sort;

/**
 * Created by tina on 1/3/18.
 */

public class UtilityClass {
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


