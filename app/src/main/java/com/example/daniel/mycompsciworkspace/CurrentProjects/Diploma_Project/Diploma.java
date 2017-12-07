package com.example.daniel.mycompsciworkspace.CurrentProjects.Diploma_Project;

/**
 * Created by tina on 12/7/17.
 */

public class Diploma {
    private Student Recipient;
    private final String University = "University Of West Hampshire";
    private int month;
    private int year;

    public Diploma(){
        Recipient = new Student("Unknown");
        month = 1;
        year = 2000;
    }
    public Diploma(Student Recipient, int month, int year){
        this.Recipient = Recipient;
        this.month = month;
        this.year = year;
    }

    public String getMonth() {
        switch (month){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                System.out.println("Fatal Error");
                System.exit(0);
                return "Error";
        }
    }


    public void Certificate(){
        String cert = "\t\t" + University.toUpperCase() +
                      "\n\t\t" + getMonth() + year +
                      "\n\t\tThis diploma is awarded to:" +
                      "\n\t\t" + Recipient.getName() +
                      "\n\n\n\tSUBJECT\t\t\tGRADE";
        //TODO add for-loop to print each subjects and grades
    }
}
