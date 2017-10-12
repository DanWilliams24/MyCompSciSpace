package com.example.daniel.mycompsciworkspace;




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

        System.out.println("Enter Text");
        Scanner reader = new Scanner(System.in);
        String text = "My name is Daniel Williams. I love computer programming,technology and the sciences. I am passionate about coding because it allows me to express my creativity. I took this class because as a programmer I need to create functional & beautiful experiences for my users to experience. By taking this class, I hope to further my artistic knowledge and learn to recognize art and its history.";

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
