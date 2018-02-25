package com.example.daniel.mycompsciworkspace.School.OOP.EmployeeProject;

import java.text.NumberFormat;

/**
 * Created by Daniel on 2/11/18.
 */

public class TitledEmployee extends SalariedEmployee {
    private String title;


    public TitledEmployee(){
        super();
        title = "Sample";

    }

    public TitledEmployee(SalariedEmployee employee, String title){
        super(employee);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getName() {
        return super.getName() + " - " + title;
    }

    @Override
    public String toString() {
        NumberFormat formatCurrency = NumberFormat.getCurrencyInstance();
        return  "Employee: " + getName() +
                "\nID: " + getId() +
                "\nHire Date: " + getHireDate().toString() +
                "\nSalary: " + formatCurrency.format(getSalary()) +
                "\nPay: " + getPay() +
                "\nTaxes: " + getTaxes();
    }
}
