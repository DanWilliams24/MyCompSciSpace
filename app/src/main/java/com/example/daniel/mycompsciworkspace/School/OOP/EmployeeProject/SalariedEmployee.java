package com.example.daniel.mycompsciworkspace.School.OOP.EmployeeProject;

import java.text.NumberFormat;

/**
 * Created by Daniel on 2/11/18.
 */

public class SalariedEmployee extends Employee {
    private double salary;
    public SalariedEmployee(){
        super();
        salary = 0.0;
    }

    public SalariedEmployee(int theId, String theName,Date theDate, double theSalary){
        super(theId,theName,theDate);

        salary = theSalary;
    }

    public SalariedEmployee(SalariedEmployee objEmp){
        super(objEmp.getId(), objEmp.getName(),objEmp.getHireDate());
        salary = objEmp.salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getTaxes(){
        NumberFormat FormattedCurrency = NumberFormat.getCurrencyInstance();
        double num = (0.25 * calculatePay()) + (0.07 * calculatePay());
        return FormattedCurrency.format(num);
    }

    public double calculatePay(){
        return salary/12;
    }

    public String getPay(){
        NumberFormat FormattedCurrency = NumberFormat.getCurrencyInstance();
        return FormattedCurrency.format(calculatePay());
    }

    public void setSalary(double salary) {
        if(salary > 0){
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        NumberFormat formatCurrency = NumberFormat.getCurrencyInstance();
        return super.toString() + "\nSalary: " + formatCurrency.format(salary) + "\nPay: " + getPay();
    }

    public boolean equals(SalariedEmployee other) {
        return (super.equals(other) && salary == other.salary) ;
    }


}
