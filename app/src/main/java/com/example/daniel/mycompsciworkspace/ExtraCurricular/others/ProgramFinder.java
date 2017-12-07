package com.example.daniel.mycompsciworkspace.ExtraCurricular.others;

import com.example.daniel.mycompsciworkspace.School.Math.CalculatorV1;
import com.example.daniel.mycompsciworkspace.School.Situations.InventoryControl;
import com.example.daniel.mycompsciworkspace.School.Situations.NewspaperPurchase;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Daniel on 10/11/17.
 */

public class ProgramFinder {

    //Variables
    static String user;
    static String isName;
    static Boolean foundUser;
    static String task;
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> AvailableTasks = new ArrayList();
    static Programs programChosen = Programs.Unknown;

    //Arrays and ArrayLists
    public static ArrayList<String> getAvailableTasks() { //If new tasks are added, make sure to update this getter.
        AvailableTasks.add("Calculator-V1: A simple 3-step Calculator");
        AvailableTasks.add("Newspaper Purchase: A simple way of adding the prices of newspapers");
        AvailableTasks.add("Inventory Control: Counts and sorts objects put in categories");
        AvailableTasks.add("xyz-Math: A way to multiply three numbers by an integer, and output the sum");
        return AvailableTasks;
    }

    //Enums
    public enum Programs {
        CalculatorV1,NewspaperPurchase, InventoryControl,xyzMath,Unknown
    }



    //Start of Processing
    static public void main(String[] args){
        getAvailableTasks();
        getUserName();
    }

    private static void getUserName() {
        System.out.println("Enter your first name: ");
        user = input.next();

        determineUser();
    }//Runs First
    private static void determineUser() {
        System.out.println("Is your name: " + user + "? (y/n)" );
        isName = input.next();
        isName = isName.toLowerCase();
        switch(isName){
            case "y": foundUser = true;
                break;
            case "n": foundUser = false;
                break;
            default: foundUser = true;
                break;
        }


        switch (user.toLowerCase()){
            case "gunvir": System.out.println("Error: Gunvir = L; No permissions. Terminating Program.");
                System.exit(1);
                break;
            case "daniel": System.out.println("Welcome Daniel!");
                break;
            case "alex": System.out.println("Welcome Alex!");
               break;
            default: System.out.println("Welcome!");
                getUserName();
                break;
        }
        determineTask();

    }//Runs Second
    private static void determineTask(){
        for(int i = 0; i < 4; i++){
            System.out.println(getAvailableTasks().get(i));
            System.out.println("    ");
        }

        System.out.println("What would you like to do? (type program as shown above)");
        task = input.next();
        switch (task.toLowerCase()){
            case "xyz-math": programChosen = Programs.xyzMath;
                break;
            case "calculator-v1": programChosen = Programs.CalculatorV1;
                break;
            case "inventory control":programChosen = Programs.InventoryControl;
                break;
            case "newspaper purchase":programChosen = Programs.NewspaperPurchase;
                break;
            default:System.out.println("Unknown Task");
                determineTask();
                break;
        }
        allowClassAccess(programChosen);

    }//Runs Third
     static public void allowClassAccess(Programs chosenClass){
        switch (chosenClass){
            case xyzMath: xyzMath.main(null);
               break;
            case CalculatorV1: CalculatorV1.main(null);
                break;
            case InventoryControl: InventoryControl.main(null);
                break;
            case NewspaperPurchase: NewspaperPurchase.main(null);
                break;
        }

    }//Runs fourth


    //End of Processing
}
