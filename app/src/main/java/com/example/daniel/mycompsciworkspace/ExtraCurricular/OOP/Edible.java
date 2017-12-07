package com.example.daniel.mycompsciworkspace.ExtraCurricular.OOP;

/**
 * Created by tina on 11/26/17.
 */

public interface Edible extends NonEdible {
    enum Taste {
        Sweet,Sour,Salty,Bitter,Pungent,Astringent,Unknown
    }

    Taste getTaste();
}
