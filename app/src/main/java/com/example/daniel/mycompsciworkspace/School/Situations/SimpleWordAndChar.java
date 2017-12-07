package com.example.daniel.mycompsciworkspace.School.Situations;

import java.util.Scanner;
public class SimpleWordAndChar {
    public static void main(String[] args) {
        //Initialize Variables
        Character character;
        Integer wordCount = 0;
        String text;
        Scanner input = new Scanner(System.in);

        //Begin Processing
        System.out.println("Enter Text");
        text = input.nextLine();
        for(int i = 0; i < text.length(); i++){
            character = text.charAt(i);
            if(character.equals('.') || character.equals(' ') || character.equals('!') || character.equals('?')) {
                wordCount++;
            }
        }
        System.out.println("Word Count: "+ wordCount + "\t Character Count: "+text.length());
        //End Processing
    }
}
