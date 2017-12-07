package com.example.daniel.mycompsciworkspace.ExtraCurricular.OOP;

import java.util.Date;

/**
 * Created by Daniel on 11/26/17.
 */

public abstract class FridgeItem {
    private java.util.Date dateAdded;
    private java.util.Date lastTimeRemoved;
    private boolean inFridge;
    private String name;
    private String brand;



    protected FridgeItem(){
        dateAdded = new java.util.Date();
        inFridge = true;
        lastTimeRemoved = null;
    }

    protected FridgeItem(String name, String brand, boolean inFridge){
        dateAdded = new java.util.Date();
        lastTimeRemoved = null;
        this.name = name;
        this.brand = brand;
        this.inFridge = inFridge;
    }


    public boolean inFridge() {
        return inFridge;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public Date getLastTimeRemoved() {
        return lastTimeRemoved;
    }

    public String getBrand() {
        return brand;
    }


    public String getName() {
        return name;
    }


    public void setInFridge(boolean inFridge){
        this.inFridge = inFridge;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastTimeRemoved(Date lastTimeRemoved) {
        this.lastTimeRemoved = lastTimeRemoved;
    }


    @Override
    public String toString() {
        if(!(lastTimeRemoved == null)){
            return name + " by " + brand +
                    "\nAdded to Fridge on " + dateAdded +
                    "\nLast time removed from Fridge: " + lastTimeRemoved;
        }else{
            return name + " by " + brand +
                    "\nAdded to Fridge on " + dateAdded +
                    "\nHas Never been removed from Fridge";
        }
    }


    public abstract double getPrice();
    public abstract Object getType();

}
