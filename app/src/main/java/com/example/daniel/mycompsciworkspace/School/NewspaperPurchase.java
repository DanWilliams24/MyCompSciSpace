package com.example.daniel.mycompsciworkspace.School;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Daniel on 9/18/17.
 */

public class NewspaperPurchase {
    public static void main(String[] args){
        Double total = 0.00;
        Integer numberOfItems = 0;
        Double cost;
        Double average;
        Boolean isDone = false;
        String name;
        String moreDataInput;
        Scanner input = new Scanner(System.in);
        //User can add data to the system while isDone = false
        while (!isDone){
            System.out.println("Enter Newspaper Name and cost in  the following format(Newspaper 0.00): ");
            name = input.next();
            cost = input.nextDouble();
            total = total + cost;
            numberOfItems = numberOfItems +1;
            System.out.println(name);
            System.out.println(cost);

            System.out.println("Add more data?(y/n)");
            moreDataInput = input.next();
            if(moreDataInput.equals("n")){
                isDone = true;
            }
        }
        DecimalFormat numberFormatter = new DecimalFormat("#.00");
        average  = total/numberOfItems;
        System.out.println("Total: $"+ numberFormatter.format(total));
        System.out.println("Average: $"+ numberFormatter.format(average));

    }
}
