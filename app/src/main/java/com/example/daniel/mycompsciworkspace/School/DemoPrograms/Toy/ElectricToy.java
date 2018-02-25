package com.example.daniel.mycompsciworkspace.School.DemoPrograms.Toy;

public class ElectricToy extends Toy {

    public double cost;

    public ElectricToy(){
        super();
        cost = 0.0;
    }

    public ElectricToy(String eToy, String eAction){
        super(eToy, eAction);
        if (eToy.equalsIgnoreCase("Turbo Train"))
            this.cost = 50.75;
        else
            this.cost = 10.28;
    }

    public static void main(String[] args){
        String toyName = "Turbo Train";
        int batteryRequired = 4;
        String sound = "Turbo Train Turbo Train choo choo run run run choo choo";

        ElectricToy demo = new ElectricToy();
        System.out.println(demo.toString() + '\n' + "Cost: " + demo.cost);
        demo.addBattery(0);

        System.out.println();

        ElectricToy demo1 = new ElectricToy(toyName, sound);
        System.out.println(demo1.toString() + '\n' + "Cost: " + demo1.cost);
        demo1.addBattery(batteryRequired);

        System.out.println();

        String toyName2 = "Super Car";
        int batteryRequired2 = 2;
        String sound2 = "VROOOOOOM VROOOOOM VROOOOM";

        ElectricToy demo2 = new ElectricToy(toyName2,sound2);
        System.out.println(demo2.toString() + '\n' + "Cost: " + demo2.cost);
        demo2.addBattery(batteryRequired2);

    }

}