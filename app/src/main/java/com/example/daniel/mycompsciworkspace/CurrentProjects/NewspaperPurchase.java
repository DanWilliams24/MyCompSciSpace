package com.example.daniel.mycompsciworkspace.CurrentProjects;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Daniel on 9/18/17.
 */

public class NewspaperPurchase {
    public static void main(String[] args){
        
        ArrayList<String> namesArray = new ArrayList<String>();
        Double total = 0.00;
        Integer itemNums = 0;
        String userItemCode;
        Double cost = 0.00;
        Double average = 0.00;
        Boolean isDone = false;
        String name = "";
        String moreDataInput;

        while (isDone != true){
            System.out.println("Enter Newspaper Name and cost in  the following format(Newspaper-0.00): ");
            Scanner reader = new Scanner(System.in);
            userItemCode = reader.next();

            for(int i = 0; i < userItemCode.length(); i++){
                Character currentChar = userItemCode.charAt(i);
                if(currentChar.equals('-')){
                    Integer dashLocation = i;
                    name = " ";
                    for(int x = 0; x < dashLocation; x++){
                        name = name+ userItemCode.charAt(x);

                    }
                    namesArray.add(name);

                    String price = " "+ userItemCode.charAt(dashLocation + 1)
                                      + userItemCode.charAt(dashLocation +2)
                                      + userItemCode.charAt(dashLocation +3)
                                      + userItemCode.charAt(dashLocation +4);
                    cost = Double.parseDouble(price);

                }
            }

            total = total + cost;
            itemNums = itemNums +1;
            System.out.println(name);
            System.out.println(cost);

            System.out.println("Add more data?(y/n)");
            moreDataInput = reader.next();
            if(moreDataInput.equals("n")){
                isDone = true;
            }
        }
        DecimalFormat numberFormatter = new DecimalFormat("#.00");

        average  = total/itemNums;
        System.out.println("Total: $"+ numberFormatter.format(total));
        System.out.println("Average: $"+ numberFormatter.format(average));

        System.out.println(namesArray);

    }
}
