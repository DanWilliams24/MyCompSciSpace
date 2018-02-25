package com.example.daniel.mycompsciworkspace.School.OOP.EmployeeProject;

import java.text.NumberFormat;

/**
 * Created by Daniel on 2/11/18.
 */

public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hours;

    public HourlyEmployee(){
        super();
        wageRate = 0.0;
        hours = 0.0;

    }

    public HourlyEmployee(int theId, String theName,Date theDate, double theWageRate, double theHours){
        super(theId,theName,theDate);

        wageRate = theWageRate;
        hours = theHours;
    }

    public HourlyEmployee(HourlyEmployee objEmpl){
        super(objEmpl.getId(), objEmpl.getName(),objEmpl.getHireDate());

        wageRate = objEmpl.wageRate;
        hours = objEmpl.hours;

    }


    public double getHours() {
        return hours;
    }

    public double getRate() {
        return wageRate;
    }

    public String getTaxes(){
        NumberFormat FormattedCurrency = NumberFormat.getCurrencyInstance();
        double num = (0.25 * calculatePay()) + (0.07 * (calculatePay()));
        return FormattedCurrency.format(num);
    }

    public double calculatePay(){
        return wageRate*hours;
    }

    public String getPay() {
        NumberFormat FormattedCurrency = NumberFormat.getCurrencyInstance();
        return FormattedCurrency.format(calculatePay());
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setRate(double wageRate) {
        this.wageRate = wageRate;
    }

    @Override
    public String toString() {
        NumberFormat formatCurrency = NumberFormat.getCurrencyInstance();
        return super.toString() + "\nWage: " + formatCurrency.format(wageRate) + "\nHours: " + hours + "\nPay: " + getPay() + "\nTaxes: " + getTaxes();
    }

    public boolean equals(HourlyEmployee other) {
        return ( super.equals(other) && (this.hours == other.hours) && (this.wageRate == other.wageRate)
        );

    }


}
