package com.example.daniel.mycompsciworkspace.School.DemoPrograms;
import java.util.Scanner;
/**
 * Created by Daniel on 10/4/17.
 */
public class DemoInput2 {
    public static void main(String[] args){
        int number;
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Enter number 1-7(inclusive)");
        number = keyIn.nextInt();
        switch (number){
            case 1: System.out.println("Sunday");
                break;
            case 2: System.out.println("Monday");
                break;
            case 3: System.out.println("Tuesday");
                break;
            case 4: System.out.println("Wednesday");
                break;
            case 5: System.out.println("Thursday");
                break;
            case 6: System.out.println("Friday");
                break;
            case 7: System.out.println("Saturday");
                default: System.out.print("Number not between 1-7(inclusive)"); System.exit(1);
        }
    }
}
