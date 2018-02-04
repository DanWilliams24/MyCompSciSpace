package com.example.daniel.mycompsciworkspace.School.OOP;

/**
 * Created by tina on 11/11/17.
 */

public class FirstDate {
    private String month;
    private int day;
    private int year;

    /***************************************CONSTRUCTORS*****************************************/
    public FirstDate(){

        month = "valid month";
        day = 1;
        year = 1900;
    }
    /***************************************ACCESSORS*****************************************/

    public String getMonth(){
        return this.month;
    }

    public int getDay(){
        return this.day;
    }

    public int getYear(){
        return this.year;
    }




    /***************************************Mutators*****************************************/
    private void setDate(int month, int day, int year){
        this.month = monthName(month);
        this.day = day;
        this.year = year;
    }



    /***************************************METHODS*****************************************/
    //public boolean equals(FirstDate birthday){
     //   return((month.equals(birthday.month)) && (day == birthday.day));
    //}

    public void displayOutput(){
        System.out.println(getMonth() + " " + getDay() + ", " + getYear() );
    }

    public void displayAge(FirstDate birthday){
        if(this.equals(birthday)){
            int age = this.year - birthday.year;
            System.out.println("Age: " + age);
        }
    }

    public String monthName(int month){
        switch (month){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                System.out.println("Fatal Error");
                System.exit(0);
                return "Error";
        }
    }

    /***************************************MAIN*****************************************/
    public static void main(String[] args){
        FirstDate birthday = new FirstDate();
        birthday.setDate(11,1,2001);
        birthday.displayOutput();

        FirstDate today = new FirstDate();
        today.setDate(11,1,2017);
        today.displayOutput();

        today.displayAge(birthday);



    }
}

/*
The FirstDate Class contains 1 Constructor, 3 Accessors, and multiple methods.
The code in the main() creates two instances of FirstDate(), birthday, and today.
 These instances are then compared using the displayAge method, to determine
 whether today is the User’s birthday. In this case, the age is augmented by 1 and is displayed
*/




//kishayan@gmail.com, starstruckcountry@gmail.com, lexmako81@gmail.com