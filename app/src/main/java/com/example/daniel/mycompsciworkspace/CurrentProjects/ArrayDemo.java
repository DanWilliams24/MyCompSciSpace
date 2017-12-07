package com.example.daniel.mycompsciworkspace.CurrentProjects;

import java.util.Scanner;

public class ArrayDemo {
    /************************************INSTANCE VARIABLES***************************************/

    private int[] demoArray;

    /***************************************CONSTRUCTORS*****************************************/

    public ArrayDemo(int[] arr){

        demoArray = arr;
    }
    /***************************************ACCESSORS*****************************************/

    public int[] getDemoArray() {
        return demoArray;
    }

    /***************************************MUTATORS*****************************************/


    public void setDemoArray(int[] demoArray) {
        this.demoArray = demoArray;
    }


    /***************************************METHODS*****************************************/
    public int findTotal() {

        int total = 0;
        for(int index: demoArray ){
            total += index;
        }
        return total;
    }

    public int findMax() {

        int max = 0;
        max = this.demoArray[0];
        for(int i = 1; i < demoArray.length; i++){
            if(max < demoArray[i]){
                max = demoArray[i];
            }
        }

        return max;
    }


    public int findDifference(int max) {

        int Difference = 0;
        for(int i = 1; i < demoArray.length; i++){
            int possibleDiff = Math.abs(max - demoArray[i]);
            if(possibleDiff > Difference){
                Difference = possibleDiff;
            }
            if(max < demoArray[i]){
                System.out.println("The element " + demoArray[i] + " is "+ possibleDiff + " greater than " + max);
            }else if(max > demoArray[i]){
                System.out.println("The element " + demoArray[i] + " is "+ possibleDiff + " less than " + max);
            }else if(max < demoArray[i]){
                System.out.println("The element " + demoArray[i] + " is equal to max");
            }
        }
        return Difference;
    }

    public String[] findValue(int val) {


        String[] strings = new String[demoArray.length];
        for(int i = 0; i < demoArray.length; i++){
            if(val == demoArray[i]){
                strings[i] = "Value: " + val + " is present at index: " + i;
                i = demoArray.length;
            }
            if(i == demoArray.length -1 && val != demoArray[i]) {
                strings[i] = "Value: " + val + " is not present at any index of the array";
            }
        }
        return strings;
    }

    public int[] doubleArr() {

        for(int i = 0; i < demoArray.length; i++){
            demoArray[i] = 2*demoArray[i];
        }
        return demoArray;

    }

    private void sort(int[] sort){
        for(int i = 0; i < sort.length; i++) {
            for (int r = 0; r < sort.length - 1; r++) {
                if (sort[r] > sort[r + 1]) {
                    int temp = sort[r + 1];
                    sort[r + 1] = sort[r];
                    sort[r] = temp;
                }
            }
        }
    }

    public boolean equals(int[] secondArr){
        int numsEqual = 0;
        int[] p = demoArray;
        int[] q = secondArr;
        sort(p);
        sort(q);
        for (int i = 0; i < q.length; i++) {
            System.out.println(q[i]);
        }
        if(p.length == q.length){
            for(int i = 0; i < p.length; i++){
                if(p[i] == q[i]) {
                    numsEqual+= 1;
                }else{
                    System.out.println(p[i] + " of the array p and " + q[i] + " of the array q are unequal at index " + i);
                }
            }
            if(numsEqual == p.length){
               return true;
            }
        }
        return false;
    }
    public void Menu(){
        System.out.println( "1. Total Array \n"+

                "2. Find Max \n" +
                "3. Find Difference \n" +
                "4. Find Value \n" +
                "5. Double Array \n" +
                "6. Compare \n" +
                "Make a selection");

    }


    /***************************************MAIN*****************************************/
    public static void main(String[] args) {
        int[] score = {120,16,54,41,33};
        Scanner input = new Scanner(System.in);
        ArrayDemo myDemo = new ArrayDemo(score);
        myDemo.Menu();
        switch (input.nextInt()){
            case 1:
                System.out.println("Total: " + myDemo.findTotal());
                break;
            case 2:
                System.out.println("Max: " + myDemo.findMax());
                break;
            case 3:
                System.out.println("Largest Difference: " + myDemo.findDifference(myDemo.findMax()));
                break;
            case 4:
                System.out.println("Insert value to search for: ");
                int val = input.nextInt();
                for (int i = 0; i < myDemo.demoArray.length ; i++) {
                    String [] strings = myDemo.findValue(val);
                    if(!(strings[i] == null)){
                        System.out.println(strings[i]);
                    }
                }
                break;
            case 5:
                for(int element: myDemo.doubleArr()) {
                    System.out.print(element);
                }

                break;
            case 6:
                System.out.println("Enter number of values for comparison:");
                int[] vals = new int[input.nextInt()];
                System.out.println("Insert " + vals.length + " values for second array:"); //may not work
                for (int i = 0; i < vals.length; i++) {
                    vals[i] = input.nextInt();
                }
                System.out.println(myDemo.equals(vals));
                break;
            default:
                System.out.println("Fatal Error");
                System.exit(0);
                break;
        }
        main(null);
    }
}
