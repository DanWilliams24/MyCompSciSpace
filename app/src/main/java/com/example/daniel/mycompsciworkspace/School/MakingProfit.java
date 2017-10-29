package com.example.daniel.mycompsciworkspace.School;

import java.util.ArrayList;

/**
 * Created by Daniel on 10/9/17.
 */

public class MakingProfit {


    public static void main(String[] args){
        Integer[][] data;
        ArrayList <Integer> rowTotal = new ArrayList(7);

        data = new Integer[][]{ //You can change the data here. Currently the program can only handle 2D arrays : (
                {10,20}, //Monday
                {20,30}, //Tuesday
                {40,70}, //Wednesday
                {20,20}, //Thursday
                {40,900}, //Friday
                {10,10}, //Saturday
                {0,0} //Sunday
        };



        for(int i = 0; i < data.length; i++){
            rowTotal.add(data[i][0] + data[i][1]);
        }

        int greatest = rowTotal.get(0);
        for(int i = 0; i < rowTotal.size(); i++){
            if(rowTotal.get(i) >= greatest){
                greatest = rowTotal.get(i);
            }
        }

        for(int i = 0; i < rowTotal.size(); i++){
            if(rowTotal.get(i) == greatest){
                switch (i){
                    case 0:
                        System.out.println("Monday");
                        break;
                    case 1:
                        System.out.println("Tuesday");
                        break;
                    case 2:
                        System.out.println("Wednesday");
                        break;
                    case 3:
                        System.out.println("Thursday");
                        break;
                    case 4:
                        System.out.println("Friday");
                        break;
                    case 5:
                        System.out.println("Saturday");
                        break;
                    case 6:
                        System.out.println("Sunday");
                        break;

                }
            }
        }


    }


}
