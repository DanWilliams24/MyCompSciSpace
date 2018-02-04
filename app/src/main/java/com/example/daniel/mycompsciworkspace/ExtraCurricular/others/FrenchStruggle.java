package com.example.daniel.mycompsciworkspace.ExtraCurricular.others;

import java.util.Scanner;

/**
 * Created by tina on 12/22/17.
 */

public class FrenchStruggle {
    private char failingGrade;
    private String reason;
    private int periodItHappened;
    private boolean isDaneshPresent;
    private boolean didFail;

    public FrenchStruggle(){
        failingGrade = 'A';
        reason = "IDK";
        periodItHappened = 1;
        isDaneshPresent = true;

    }
    public FrenchStruggle(char failingGrade, String reason, boolean isDaneshPresent, int periodItHappened){
        this.failingGrade = failingGrade;
        this.reason = reason;
        this.isDaneshPresent = isDaneshPresent;

    }

    public boolean isDidFail() {
        return didFail;
    }

    public boolean isDaneshPresent() {
        return isDaneshPresent;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setDaneshPresent(boolean daneshPresent) {
        isDaneshPresent = daneshPresent;
    }

    public void setDidFail(boolean didFail) {
        this.didFail = didFail;
    }

    public void fail(){

        System.err.println("French Grade lowered");
    }
    public void printFailure(){
        System.out.println("FAILURE");
        System.out.println(reason);

    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        FrenchStruggle MyStruggle = new FrenchStruggle('A',input.nextLine(),input.nextBoolean(),input.nextInt());
        MyStruggle.printFailure();
        MyStruggle.fail();
    }

}
