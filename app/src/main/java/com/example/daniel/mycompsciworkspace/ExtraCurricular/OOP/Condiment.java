package com.example.daniel.mycompsciworkspace.ExtraCurricular.OOP;

/**
 * Created by Daniel on 11/26/17.
 */

public abstract class Condiment extends FridgeItem implements NonEdible {
    public enum containerType{
        Glass_Bowl,Glass_Bottle,Glass_Container,Plastic_Bowl,Plastic_Bottle,Plastic_Container

    }
    containerType container;

    @Override
    public String waysToTurnEdible() {
        return "Pour out of container";
    }

    protected Condiment(){

    }

}
