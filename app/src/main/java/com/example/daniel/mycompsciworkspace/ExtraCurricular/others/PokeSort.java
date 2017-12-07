package com.example.daniel.mycompsciworkspace.ExtraCurricular.others;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Daniel on 10/2/17.
 */

public class PokeSort {
    public static void main(String[] args){
        ArrayList<String> namesArray = new ArrayList();
        ArrayList<String> typesArray = new ArrayList();
        Double total = 0.00;
        Integer itemNums = 0;
        String userItemCode;
        String type = " ";
        Double average = 0.00;
        Boolean isDone = false;
        String name = "";
        String moreDataInput;

        while (isDone != true){
            System.out.println("Enter Pokemon Name and Type in  the following format(Pokemon-Type): ");
            Scanner reader = new Scanner(System.in);
            userItemCode = reader.next();

            for(int i = 1; i < userItemCode.length(); i++){
                Character currentChar = userItemCode.charAt(i);
                if(currentChar.equals('-')){
                    Integer dashLocation = i;
                    name = " ";
                    for(int x = 0; x < dashLocation; x++){
                        name = name + userItemCode.charAt(x);

                    }
                    for(int g = dashLocation + 1; g < userItemCode.length(); g++){
                        type = type + userItemCode.charAt(g);

                    }
                    namesArray.add(name);
                    typesArray.add(type);



                }
            }


            itemNums = itemNums +1;
            System.out.println(name);
            System.out.println(type);

            System.out.println("Add more data?(y/n)");
            moreDataInput = reader.next();
            if(moreDataInput.equals("n")){
                isDone = true;
            }
            type = "";
        }

        System.out.println(namesArray);
        System.out.println(typesArray);
        Arrays.sort(namesArray.toArray());
        Arrays.sort(typesArray.toArray());
        System.out.println(namesArray);
        System.out.println(typesArray);

    }
}
