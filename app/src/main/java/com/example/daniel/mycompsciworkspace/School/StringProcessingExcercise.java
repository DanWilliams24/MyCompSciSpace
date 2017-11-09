package com.example.daniel.mycompsciworkspace.School;

/**
 * Created by tina on 11/1/17.
 */

public class StringProcessingExcercise {
    public static void main(String[] args){
        String sentence = "Rockets Football Team - Go Rockets Football Stars";
        String sentence2 = " AP Computer Science";
        String sentence3 = " AP Computer Science";


        int strLength = sentence.length();
        System.out.println("Use of String Methods");

        System.out.println("Number of characters in the sentence- " + sentence + "=" + sentence.length());

        System.out.println("The Index position of the word Football is - " + sentence.indexOf("Football"));


        System.out.println("The Index position of the 2nd occurrence word of the wordFootball is - " + sentence.indexOf("Football", 2));

        System.out.println("The index position of Soccer is " + sentence.indexOf("Soccer"));
        System.out.println("The index position of Football is " + sentence.toUpperCase());
        System.out.println("The index position of Football is " + sentence.toLowerCase());

        System.out.println("The character at position 24 is the sentence - " + "1s" + sentence.charAt(24));

        System.out.println("The index position of Soccer is " + sentence.indexOf("Soccer"));
        System.out.println("The index position of Soccer is " + sentence.substring(8));
        System.out.println("The index position of Soccer is " + sentence.substring(8,21));

        System.out.println("Comparison " + sentence.compareTo(sentence3));
        sentence = " AP History";
        System.out.println("Comparison " + sentence.compareTo(sentence3));

        sentence = "AP Art History";
        System.out.println("Comparison " + sentence.compareTo(sentence3));

        System.out.println("Comparison " + sentence.equals(sentence3));


        String sentence4 = "Rockets Football Team";
        System.out.println("Comparison : " + sentence4.contains("Football"));
        System.out.println("Comparison : " + sentence4.contains("Team"));
        System.out.println("Comparison : " + sentence4.contains("hello"));
    }
}
