package com.example.daniel.mycompsciworkspace.School.DemoPrograms.Toy;

/**
 * Created by tina on 2/6/18.
 */

public class MechanicalToy extends Toy {
    private String intendedAudience;

    public MechanicalToy(){
        super();
        intendedAudience = "boy";
    }

    public MechanicalToy(String mToy, String maction, String intendedAudience){
        super(mToy, maction);
        this.intendedAudience = intendedAudience;
    }


    public static void main(String[] args){
        String toyName = "Super Car";
        int batteryRequired = 2;
        String sound = "VROOOOOOM VROOOOOM VROOOOM";
        String audience = "Boy";

        MechanicalToy demo1 = new MechanicalToy(toyName, sound, audience);
        System.out.println(demo1.toString() + '\n' + "Intended Audience: " + demo1.intendedAudience);
        demo1.addBattery(batteryRequired);

        System.out.println();
    }

}
