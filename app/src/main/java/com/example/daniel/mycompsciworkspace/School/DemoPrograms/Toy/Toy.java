package com.example.daniel.mycompsciworkspace.School.DemoPrograms.Toy;


public class Toy {
    public static final int battery = 6;

    private String name;
    private String action;

    public Toy(){
        name = "New Toy";
        action = "Noise Maker";
    }

    public Toy(String theName, String theAction){

        if (theName == null){
            System.out.println("Fatal Error creating animal");
            System.exit(0);
        }
        name = theName;
        action = theAction;
    }

    public void addBattery(int number){
        System.out.println((number + battery) + " Batteries required");
        System.out.println("Batteries sold separately");
    }

    public String toString(){
        return("Name of Toy: " + name + '\n' + "Action: " + action);
    }
}
