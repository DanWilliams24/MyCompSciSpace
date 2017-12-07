package com.example.daniel.mycompsciworkspace.School.DemoPrograms;

import java.util.Scanner;

/**
 * Created by Daniel on 10/4/17.
 */

public class DemoInput1 {
    public static void main(String[] args){
        String subjectName;
        int subjectCode;
        double subjectCost;
        int num;
        String s1;
        String s2;

        Scanner keyIn = new Scanner(System.in);


        System.out.println("Enter the subject code");
        subjectCode = keyIn.nextInt();


        System.out.println("Enter the Subject Cost");
        subjectCost = keyIn.nextDouble();

        System.out.println("Enter the name of the subject: \t");
        subjectName = keyIn.next();




        System.out.println("Subject: " + subjectName + "\tSubject Code: " + subjectCode + "\tSubject Cost: " + subjectCost);


        System.out.println("Enter the Number");
        num = keyIn.nextInt();


        System.out.println("Enter the first string");
        s1 = keyIn.next();

        System.out.println("Enter the second string: ");
        s2 = keyIn.next();


        System.out.println(num +" "+ s1 +" "+s2);
    }
}
