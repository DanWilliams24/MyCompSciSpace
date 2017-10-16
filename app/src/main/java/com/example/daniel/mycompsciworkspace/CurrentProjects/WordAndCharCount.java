package com.example.daniel.mycompsciworkspace.CurrentProjects;

import java.util.Scanner;

/**
 * Created by Daniel on 9/17/17.
 */

public class WordAndCharCount {
    public static void main(String[] args) {

        Character ch;
        Integer wordCount = 0;
        Integer sentenceCount = 0;
        Integer charCount = 0;
        String text;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Text");

         text = input.nextLine();
        System.out.println(text.length());
        System.out.println(text);
        for(int i = 0; i < text.length(); i++){
            ch = text.charAt(i);
            if(ch.equals('.')){

                charCount = charCount+ 1; //New
                sentenceCount = sentenceCount +1;
                System.out.print(ch);
            } else if(ch.equals(' ')){
                wordCount = wordCount +1;
                charCount = charCount +1;
                System.out.print(ch);
            } else {
                charCount = charCount +1;
                System.out.print(ch);
            }

        }
        System.out.println();
        System.out.println("Word Count: "+ wordCount);
        System.out.println("Character Count: "+charCount);
        System.out.println("Sentence Count: "+sentenceCount);




    }


}
