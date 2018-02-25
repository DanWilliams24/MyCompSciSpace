package com.example.daniel.mycompsciworkspace.School.OOP.MovieProject;

/**
 * Created by tina on 2/22/18.
 */

public class Rental {
    private Movie movie;
    private int customerID;
    private int daysLate;

    public Rental(){
        movie = new Movie();
        customerID = 0;
        daysLate = 0;
    }

    public Rental(Movie movie, int customerID, int daysLate){
        this.movie = movie;
        this.customerID = customerID;
        this.daysLate = daysLate;

    }

    public double calculateLateFees(){
        return movie.calculateLateFees(daysLate);
    }

    @Override
    public String toString() {
        return movie.toString() +
                "\nCustomer ID: " + customerID +
                "\nDays Late: " + daysLate;
    }
}
