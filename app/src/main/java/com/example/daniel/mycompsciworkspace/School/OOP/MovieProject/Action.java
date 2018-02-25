package com.example.daniel.mycompsciworkspace.School.OOP.MovieProject;

public class Action extends Movie{

    public Action(){
        super();
    }

    public Action(MPAA rating, int id, String title){
        super(rating,id,title);
    }

    public double calculateLateFees(int days){
        return days*3.00;
    }

    public String toString() {
        return super.toString() + "\nMovie Type: Action";
    }

}
