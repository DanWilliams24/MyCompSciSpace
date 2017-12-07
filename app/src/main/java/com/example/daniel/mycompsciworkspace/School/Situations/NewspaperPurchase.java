package com.example.daniel.mycompsciworkspace.School.Situations;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Daniel on 9/18/17.
 */

public class NewspaperPurchase {
    public static void main(String[] args){
        Double total = 0.00;
        Integer numberOfItems = 0;
        ArrayList cost;
        Double average;
        Boolean isDone = false;
        ArrayList name;
        String moreDataInput;
        Scanner input = new Scanner(System.in);
        //User can add data to the system while isDone = false
        while (input.hasNext()){
            System.out.println("Enter Newspaper Name and cost in  the following format(Newspaper1 0.00   Newspaper2 0.00): ");
          // name.add(input.next());
           // cost.add(input.nextDouble());
        }
       // for (element:name) {

        //}
           // total = total + cost;
            numberOfItems = numberOfItems +1;
         //   System.out.println(name);
          //  System.out.println(cost);



        DecimalFormat numberFormatter = new DecimalFormat("#.00");
        //average  = total/numberOfItems;
     //   System.out.println("Total: $"+ numberFormatter.format(total));
        //System.out.println("Average: $"+ numberFormatter.format(average));

    }
}
