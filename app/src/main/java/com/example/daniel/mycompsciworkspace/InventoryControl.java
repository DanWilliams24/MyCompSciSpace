package com.example.daniel.mycompsciworkspace;



import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * Created by tina on 9/16/17.
 */

public class InventoryControl {
    public static void main(String[] args) {
        String availableCharacters = "ATCD";
        Character A = availableCharacters.charAt(0);
        Character T = availableCharacters.charAt(1);
        Character C = availableCharacters.charAt(2);
        Character D = availableCharacters.charAt(3);
        



        Boolean isDone = false;
        Integer totalCount = 0;

        Integer aCount = 0;
        Integer tCount = 0;
        Integer cCount = 0;
        Integer dCount = 0;

        Integer id;
        Character code;
        String input;
        Integer idInput;
        String codeInput;
        Scanner reader = new Scanner(System.in);  // Reading from System.in

        while (isDone.equals(false)) {

            System.out.print("More Data: ");
            input = reader.next();
            if(input.equals("yes")){
                isDone = false;
                System.out.println("OK");

            } else {
                isDone = true;
                System.out.print(input);
                System.out.println("not OK");
            }

            System.out.println("Input identification #: ");
            idInput = reader.nextInt();

            System.out.println("Input code letter: ");
            codeInput = reader.next();
            code = codeInput.charAt(0);

            if(code.equals(A)){
                totalCount = totalCount + 1;
                aCount = aCount + 1;

            }else if(code.equals(T)){
                totalCount = totalCount + 1;
                tCount = tCount + 1;

            }else if(code.equals(C)){
                totalCount = totalCount + 1;
                cCount = cCount + 1;

            }else if(code.equals(D)){
                totalCount = totalCount + 1;
                dCount = dCount + 1;

            }else{
                System.out.print("No More Data");
            }


        }
        System.out.println("A Category: "+ aCount);
        System.out.println("T Category: "+tCount);
        System.out.println("C Category: "+cCount);
        System.out.println("D Category: "+dCount);

        System.out.print("Total: " +totalCount);
        reader.close();
    }









    static String getfLine() { //This is used to detect user input
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }

}






