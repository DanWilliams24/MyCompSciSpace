package com.example.daniel.mycompsciworkspace.School.OOP.DiplomaProject;

/**
 * Created by tina on 12/6/17.
 */

public class Subject {
    private String name;
    private double marks;

    public Subject(){
        name = "valid name";
        marks = 0.0;
    }
    public Subject(String name, double grade){
        this.name = name;
        this.marks = grade;
    }
    public Subject(String name){
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public char getGrade(){
        return whatGrade();
    }

    private char whatGrade(){
        if(marks < 49){
            return 'U';
        }else if(marks < 59){
            return 'E';
        }else if(marks < 69){
            return 'D';
        }else if(marks < 79){
            return 'C';
        }else if(marks < 89){
            return 'B';
        }else if(marks <= 100){
            return 'A';
        }else{
            throw new IllegalArgumentException("Marks out of Scale:" + marks);
        }

    }


}
