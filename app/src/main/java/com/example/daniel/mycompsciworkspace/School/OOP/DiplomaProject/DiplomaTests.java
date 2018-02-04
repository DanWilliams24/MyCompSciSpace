package com.example.daniel.mycompsciworkspace.School.OOP.DiplomaProject;

import java.util.Scanner;

/**
 * Created by Daniel on 12/7/17.
 */

public class DiplomaTests {
    public static void main(String[] args){
        boolean ans;
        do {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter Student name:");
            Student stuOne = new Student(input.nextLine());
            System.out.println(stuOne);

            System.out.println("Enter the name of your three electives: ");
            Subject Elective1 = new Subject(input.nextLine());
            Subject Elective2 = new Subject(input.nextLine());
            Subject Elective3 = new Subject(input.nextLine());

            Subject[] Elective_Subjects = {Elective1,Elective2,Elective3};


            System.out.println("Enter your marks for each subject");
            for (Subject subject: stuOne.getSubjects()) {
                System.out.print("\t" + subject.getName() + " marks: ");
                subject.setMarks(input.nextDouble());
            }
            for (Subject elective: Elective_Subjects) {
                System.out.print("\t" + elective.getName() + " marks: ");
                elective.setMarks(input.nextDouble());
            }

            stuOne.setElectives(Elective_Subjects);

            System.out.println("Enter Examination Month and year:");
            Diploma diploma1 = new Diploma(stuOne,input.nextInt(),input.nextInt());
            diploma1.GenCertificate();
            System.out.println("Create another Diploma?(true/false)");
            ans = input.nextBoolean();
        }while (ans);
    }
}
