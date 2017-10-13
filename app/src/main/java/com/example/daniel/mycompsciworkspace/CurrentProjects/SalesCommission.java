package com.example.daniel.mycompsciworkspace.CurrentProjects;

import java.util.Scanner;

/**
 * Created by Daniel on 10/12/17.
 */

public class SalesCommission {
    public static void main(String[] args){
        //Initialization
        Scanner input = new Scanner(System.in);
        Double commissionPercentage = 0.00;
        Integer salesValue;
        Double commission;


        //Begin Processing
        System.out.println("Enter Sales Figure: ");
        salesValue = input.nextInt();
        if(salesValue < 100){
            System.err.println("Error: Sales Figure out of range.  Sales Figure must be greater than 100");
            System.exit(1);
        }else if(salesValue >= 100 && salesValue <= 999){
            commissionPercentage = 0.01;
        }else if(salesValue >= 1000 && salesValue <= 9999){
            commissionPercentage = 0.05;
        }else if(salesValue >= 10000 && salesValue <= 99999){
            commissionPercentage = 0.1;
        }else if(salesValue > 99999){
            System.err.println("Error: Sales Figure out of range. Sales Figure must be less than 100,000");
            System.exit(2);
        }

        commission = salesValue*commissionPercentage;

        System.out.println("Commission: $" + commission);
        input.close();
        System.out.println("End Of Processing");
        //End of Processing

    }
}
