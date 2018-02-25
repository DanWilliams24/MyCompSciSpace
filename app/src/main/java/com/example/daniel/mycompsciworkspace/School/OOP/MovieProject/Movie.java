package com.example.daniel.mycompsciworkspace.School.OOP.MovieProject;

import java.text.NumberFormat;

public class Movie {

	private MPAA rating;
	private int id;
	private String title;

	public Movie(){
		rating = new MPAA();
		id = 0;
		title = "Sample";
		
	}
	public Movie(MPAA rating, int id, String title){
		this.rating = rating;
		this.id = id;
		this.title = title;
	}
	
	public Movie(Movie movie){
		rating = movie.rating;
		id = movie.id;
		title = movie.title;
	}
	
	public int getId(){
		return id;
		
	}

	public MPAA getRating(){
		return rating;
	}

	public String getTitle(){
		return title;
	}

	public double calculateLateFees(int days){
		return days*2.0;
	}

	public String lateFeeAsString(int days){
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(calculateLateFees(days));
	}


	public String toString(){
	    return "Title: " + title +
                "\nMovie ID: " + id +
                "\nRating: " + rating.getRating();
    }

	
	public boolean equals(Movie other) {
		return ( (id == other.id) && (rating.equals(other.rating)) && (title.equals(other.title)));
	 }
	
}
