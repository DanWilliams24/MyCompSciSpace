package com.example.daniel.mycompsciworkspace.School.OOP.MovieProject;

public class Comedy extends Movie{
    public Comedy(){
        super();
    }

    public Comedy(MPAA rating, int id, String title){
        super(rating,id,title);
    }

    public double calculateLateFees(int days){
        return days*2.50;
    }

    public String toString() {
        return super.toString() + "\nMovie Type: Comedy";
    }
}
