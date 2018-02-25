package com.example.daniel.mycompsciworkspace.School.OOP.MovieProject;

/**
 * Created by tina on 2/16/18.
 */

public class Drama extends Movie {
    public Drama(){
        super();
    }
    public Drama(MPAA rating, int id, String title){
        super(rating,id,title);
    }

    public double calculateLateFees(int days){
        return days*2.00;
    }


    public String toString() {
        return super.toString() + "\nMovie Type: Drama";
    }
}
