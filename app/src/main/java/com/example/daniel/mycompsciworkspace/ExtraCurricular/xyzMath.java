package com.example.daniel.mycompsciworkspace.ExtraCurricular;

import java.util.Scanner;

/**
 * Created by tina on 10/2/17.
 */

public class xyzMath {

    static Integer result;
    static Integer xNum = 0;
    static Integer yNum = 0;
    static Integer zNum = 0;

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Input each of the 3 numbers and press enter!");
        xNum = input.nextInt();
        yNum = input.nextInt();
        zNum = input.nextInt();
       math(xNum, yNum, zNum);
    }


    public static void math(int x, int y, int z){
        x = x*13;
        y = y*5;
        z = z*462;
        result = x+y+z;
        System.out.println(result);
    }



}
