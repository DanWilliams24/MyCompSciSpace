package com.example.daniel.mycompsciworkspace.School.OOP.MovieProject;



public class MPAA {
	private String rating;
	
	public MPAA(){
		rating = "G"; 
	}

	public MPAA(String rating){
		if(ratingOK(rating)){
			this.rating = rating;
		}else{
			throw new IllegalArgumentException("Rating to set is undefined");
		}
	}
	
	
	public void setRating(String rating){
		if(ratingOK(rating)){
			this.rating = rating;
		}else{
			throw new IllegalArgumentException("Rating to set is undefined");
		}
	}
	
	
	public String getRating(){
		return rating;
	}
	
	
	public boolean ratingOK(String rating){
		switch(rating){
		case "G": return true;
		case "PG": return true;
		case "PG-13": return true;
		case "R": return true;
			default: return false;
		}
	}
	public boolean equals(MPAA other) {
		return ( rating == other.rating) ;
	}
}
