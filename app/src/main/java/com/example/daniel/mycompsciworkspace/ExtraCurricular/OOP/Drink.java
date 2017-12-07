package com.example.daniel.mycompsciworkspace.ExtraCurricular.OOP;

/**
 * Created by Daniel on 11/26/17.
 */

public abstract class Drink extends FridgeItem implements Edible {
    private String consistency;
    private Taste taste;
    private FoodStuff[] ingredients;
    protected Drink(){
        consistency = "valid Consistency";
        ingredients = null;
        taste = Taste.Unknown;
    }
    protected Drink(String consistency, Taste taste, FoodStuff...ingredients){
        this.consistency = consistency;
        this.ingredients = ingredients;
        this.taste = taste;
    }
    protected Drink(FoodStuff...ingredients){
        this.ingredients = ingredients;
    }



}


