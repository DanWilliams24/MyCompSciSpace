package com.example.daniel.mycompsciworkspace.School.OOP.EmployeeProject;

/**
 * Created by Daniel on 2/11/18.
 */

import java.util.Scanner;

public class Date {
    private String month;
    private int day;
    private int year;

    //constructor
    public Date() {
        month = "January";
        day = 1;
        year = 1900;
    }

    //constructor with 3 integer parameter
    public Date(int monthInt, int day, int year) {
        setDate(monthInt,day,year);

    }

    //constructor with 1 string and 3 integer parameter
    public Date(String monthString, int day, int year) {
        setDate(monthString,day,year);

    }

    public Date(int year) {
// day is 1, month is 1
        setDate(year);
    }

    public Date(Date aDate) {
// ensure that date is valid
        setDate(aDate.month,aDate.day,aDate.year);
    }

    public void setDate(int monthInt, int day, int year) {
        if (dateOK(monthInt, day, year)) {
            this.month = monthName(monthInt);
            this.day = day;
            this.year = year;
        } else {

            System.out.println("Fatal error");
            System.exit(0);
        }
    }

    public void setDate(String month, int day, int year) {
        if (dateOK(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        } else {
            System.out.println("Fatal error");
            System.exit(0);
        }
    }

    public void setDate(int year) {
        setDate(1, 1, year);
    }

    public void setYear(int year) {
        if ((year < 1000 || year > 9999)) {
            System.out.println("Fatal Error");
            System.exit(0);
        } else
            this.year = year;

    }

    public void setMonth(int monthNumber) {
        if ((monthNumber <= 0) || (monthNumber > 12)) {
            System.out.println("Fatal Error");
            System.exit(0);
        } else
            month = monthName(monthNumber);

    }

    public String monthName(int month) {

        switch (month) {
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

    public void setDay(int day) {
        if ((day <= 0) || (day > 13)) {
            System.out.println("Fatal Error");
            System.exit(0);
        } else
            this.day = day;

    }

    private boolean dateOK(int monthInt, int dayInt, int
            yearInt) {
        return ((monthInt >= 1) && (monthInt <= 12) && (dayInt
                >= 1) && (dayInt <= 31) && (yearInt >= 1990) && (yearInt <=
                9999));
    }

    private boolean dateOK(String monthSt, int dayInt, int
            yearInt) {
        return (monthOK(monthSt) && (dayInt >= 1) && (dayInt <=

                31) && (yearInt >= 1990) && (yearInt <= 9999));
    }

    private boolean monthOK(String month) {
        return (month.equals("January") ||
                month.equals("February") ||
                month.equals("March") ||
                month.equals("April") ||
                month.equals("May") ||
                month.equals("June") ||
                month.equals("July") ||
                month.equals("August") ||
                month.equals("September") ||
                month.equals("October") ||
                month.equals("November") ||
                month.equals("December"));
    }

    public boolean equals(Date bday) {
        return ((month.equals(bday.month)) && (day == bday.day)

                && (year == bday.year));
    }

    public String getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public int getYear() {
        return this.year;
    }

    public void readInput() {
        boolean loop = true;
        Scanner keyboard = new Scanner(System.in);
        while (loop) {
            System.out.println("Enter the name of the month , day, year");

                    String monthIn = keyboard.next();

            int dayIn = keyboard.nextInt();
            int yearIn = keyboard.nextInt();
            if (dateOK(monthIn, dayIn, yearIn)) {
                setDate(monthIn, dayIn, yearIn);
                loop = false;
            } else
                System.out.println("illegal date. Reenter data");
        }
        keyboard.close();
    }

    public String toString() {
        return (month + " " + day + " " + year);
    }
}