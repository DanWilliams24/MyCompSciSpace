package com.example.daniel.mycompsciworkspace.School.DemoPrograms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Daniel on 1/16/18.
 */
public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>(15);
        System.out.println("Enter your list of activities for today");
        boolean done = false;
        int number = 0;
        String next = null;
        String answer;

        Scanner keyboard= new Scanner(System.in);
        while(!done){
            System.out.println("Input Activity : "+ number);
            next = keyboard.nextLine();
            myList.add(next);
            number++;
            System.out.println("Do you have any more Activities to add: yes/no");
            answer = keyboard.nextLine();
            if(!(answer.equalsIgnoreCase("yes")))
                done = true;
        }
        System.out.println("This is my activity list for today. There are "+number+" entries");
        for(String entry: myList){
            System.out.println(entry);
        }
    }
}
/* Test data
	Programming 1
	Visit to Career Center
	Football
	Lunch
	Complete the list with your choice of activities
*/
