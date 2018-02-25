package com.example.daniel.mycompsciworkspace.School.OOP.EmployeeProject;

import java.util.Scanner;

/**
 * Created by Daniel on 2/11/18.
 */


public class EmployeeMain {
    static int id = 0;
    static String name = "";
    static int month = 0;
    static int day = 0;
    static int year = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Employees to enter?");
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            getInputs();
        }
    }

    public static void getInputs(){
        Scanner sc = new Scanner(System.in);

        double salary;
        String title;
        double standard ;
        double overtime;
        int hours;

        System.out.println("Type of Employee(Hourly/Salaried): ");
        String type = sc.next();
        if(type.equalsIgnoreCase("Hourly")){
            makeBasicEmployee();
            System.out.println("Enter Standard: ");
            standard = sc.nextDouble();
            System.out.println("Enter Overtime: ");
            overtime = sc.nextDouble();
            System.out.println("Enter Hours: ");
            hours = sc.nextInt();
            HourlyEmployee employee1 = createEmployee(id,name, month,day,year,standard,overtime,hours);
            System.out.println(employee1.toString());
        } else if(type.equalsIgnoreCase("Salaried")){
            makeBasicEmployee();
            System.out.println("Enter Salary: ");
            salary = sc.nextDouble();
            System.out.println("Enter Title: ");
            title = sc.next() + " " + sc.next();
            TitledEmployee employee1 = createEmployee(id,name, month,day,year,salary,title);
            System.out.println(employee1.toString());
        }else{
            throw new IllegalArgumentException("Input did not match request");
        }
    }

    public static void makeBasicEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        id = sc.nextInt();
        System.out.println("Enter name: ");
        name = sc.next() + " " + sc.next();
        System.out.println("Enter Month, Day, Year: ");
        month = sc.nextInt();
        day = sc.nextInt();
        year = sc.nextInt();
    }

    public static TitledEmployee createEmployee(int id, String name, int month, int day, int year, double salary, String title){
        Date emp1Date = new Date(month,day,year);
        SalariedEmployee employee1Data = new SalariedEmployee(id,
                name,
                emp1Date,salary);
        TitledEmployee employee1 = new TitledEmployee(employee1Data, title );
        System.out.println("");
        return employee1;
    }

    public static HourlyEmployee createEmployee(int id, String name, int month, int day, int year, double standard, double overtime, double hours){
        Date emp1Date = new Date(month,day,year);
        HourlyEmployee employee2;
        if(hours > 40){
             employee2 = new HourlyEmployee(id, name, emp1Date,overtime,hours);
        }else{
             employee2 = new HourlyEmployee(id, name, emp1Date,standard,hours);
        }
        System.out.println("");
        return employee2;
    }

}
