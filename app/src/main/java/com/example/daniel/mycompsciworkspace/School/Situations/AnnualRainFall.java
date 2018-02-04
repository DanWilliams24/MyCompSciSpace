package com.example.daniel.mycompsciworkspace.School.Situations;

/**
 * Created by tina on 1/16/18.
 */

public class AnnualRainFall {

    static int[][] data2015 = {
            {14,13,11,9,5,3,1,1,4,8,7,12},
            {17,18,15,13,11,9,7,8,9,8,15,15},
            {9,8,6,4,2,1,0,1,3,9,7,10},
            {12,11,9,6,4,2,1,3,5,8,10,13}
    };

    static int[] data2014 = {15,11,15,9,5,7,4,3,4,8,12,12};

    public static void main(String[] args){

        calculateAverages();
        calculateDriestMonth();
        calculateWettestMonths();
        calculateGreatestChange();
        String test = "aaaaa";
        String name1 = "Evelyn";
        System.out.println(test.compareTo(name1));
        System.out.println(test.compareTo("Queenly"));
        System.out.println(test.compareTo("Willard"));

    }

    public static void calculateAverages() {

        //#1 - COMPLETE
        int sum = 0;
        double average;
        for (int i = 0; i < 4; i++) {
            sum = 0;
            for (int j = 0; j < 12; j++) {
                sum += data2015[i][j];
            }
            average = sum/12;
            switch (i){
                case 0:System.out.println("Northern Average: " + average);
                    break;
                case 1:System.out.println("Southern Average: " + average);
                    break;
                case 2:System.out.println("Eastern Average: " + average);
                    break;
                case 3:System.out.println("Western Average: " + average);
                    break;
            }

        }
    }



    public static void calculateDriestMonth(){
        double[] average = getAverages();
        int minPosition = 0;
        for(int i = 0; i < 12; i++){
            if(average[i] < average[minPosition] ){
                minPosition = i;
            }
        }

        System.out.println("Driest Month: " +getMonth(minPosition+1) + "\nRainfall: " + average[minPosition] );



    }

    public static double[] getAverages() {
        double sum = 0;
        double[] average = new double[12];
        for (int i = 0; i < 12; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += data2015[j][i];
            }
            average[i] = sum/4;
        }
        return average;
    }

    public static void calculateWettestMonths(){
        double[] averages = getAverages();
        int maxPos2015 = 0;
        int maxPos2014 = 0;
        for(int i = 0; i < 12; i++){
            if(averages[i] > averages[maxPos2015] ){
                maxPos2015 = i;
            }
            if(data2014[i] > data2014[maxPos2014] ){
                maxPos2014 = i;
            }
        }
        System.out.println("\nWettest Months: \n2015 - " +getMonth(maxPos2015+1)
                                                + "\n\tRainfall: " + averages[maxPos2015] +
                                            "\n2014 - " + getMonth(maxPos2014 +1)
                                                + "\n\tRainfall: " + data2014[maxPos2014]);



    }


    public static void calculateGreatestChange(){
        double[] averages = getAverages();
        double[] differences = new double[12];
        for(int i = 0; i < 12; i++){
            differences[i] = averages[i] - data2014[i];
            if(differences[i] < 0){
                differences[i] *= -1;
            }
        }

        int maxDiffPos = 0;
        for(int i = 0; i < 12; i++){
            if(differences[i] > differences[maxDiffPos] ){
                maxDiffPos = i;
            }
        }
        System.out.println("Month with greatest change in rainfall: " + getMonth(maxDiffPos + 1));
    }



    public static String getMonth(int month) {
        switch (month){
            case 1:return "January";
            case 2:return "February";
            case 3:return "March";
            case 4:return "April";
            case 5:return "May";
            case 6:return "June";
            case 7:return "July";
            case 8:return "August";
            case 9:return "September";
            case 10:return "October";
            case 11:return "November";
            case 12:return "December";
            default:
                System.out.println("Fatal Error");
                System.exit(0);
                return "Error";
        }
    }
}
