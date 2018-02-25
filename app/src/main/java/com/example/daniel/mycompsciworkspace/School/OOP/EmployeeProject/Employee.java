package com.example.daniel.mycompsciworkspace.School.OOP.EmployeeProject;

/**
 * Created by Daniel on 2/11/18.
 */

public class Employee {
    private String name;
    private int id;
    private Date hireDate;



    public Employee(){
        id = 1000;
        name = "Sample";
        hireDate = new Date("January",1,1995);
    }

    public Employee(int theId, String theName,Date theDate){
        id = theId;
        name = theName;
        hireDate = theDate;
    }

    public Employee(Employee objEmp){
        id = objEmp.id;
        name = objEmp.name;
        hireDate = objEmp.hireDate;

    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getHireDate() {
        return hireDate;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee: " + name + "\nID: " + id + "\nHire Date: " + hireDate.toString();
    }

    public boolean equals(Employee emp2) {
        return ((this.id == emp2.id) && (this.name.equals(emp2.name)) && (this.hireDate.equals(emp2.hireDate)));
    }


}
