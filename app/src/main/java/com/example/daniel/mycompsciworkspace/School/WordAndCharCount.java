package com.example.daniel.mycompsciworkspace.School;

import java.util.Scanner;

/**
 * Created by Daniel on 9/17/17.
 */

public class WordAndCharCount {//Begin Class
    public static void main(String[] args) { //Begin Main()
        //Initialize and Identify variables
        char character;
        int wordCount = 0;
        int charCount = 0;
        String text;
        Scanner input = new Scanner(System.in);

        //Begin Processing
        System.out.println("Enter Sentence");
        text = input.nextLine();
        for(int i = 0; i < text.length(); i++){//Begin For-loop
            character = text.charAt(i);
            if(character == '.' || character == '!' || character == '?'){ //Begin if
                charCount++;
                wordCount++;
                i = text.length();
                System.out.print(character);
            } else if(character == ' '){
                wordCount++;
                charCount++;
                System.out.print(character);
            } else {
                charCount++;
                System.out.print(character);
            }//end if

        }//End for-loop
        System.out.println();
        System.out.println("Word Count: "+ wordCount);
        System.out.println("Character Count: "+charCount);
        input.close();
        //End Processing
    }//End Main()
}//End Class




