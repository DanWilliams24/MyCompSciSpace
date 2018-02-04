package com.example.daniel.mycompsciworkspace.School.Tests;

/**
 * Created by Piper on 12/8/17.
 */

import java.util.Scanner;
public class Student {

    private String StudentName;
    private String Subject1;
    private String Subject2;
    private String Subject3;
    private String Subject4;
    private String Subject5;
    private String Subject6;
    private String G1;
    private String G2;
    private String G3;
    private String G4;
    private String G5;
    private String G6;

    public Student(){
        StudentName = "Bella Mitchelle";
        Subject1 = "English Language";
        Subject2 = "English Literature";
        Subject3 = "Mathematics";
        Subject4 = "Music";
        Subject5 = "Physics";
        Subject6 = "Plant Biology";
        G1 = "B";
        G2 = "B";
        G3 = "A";
        G4 = "A";
        G5 = "B";
        G6 = "B";
    }

    public Student(String a, String b, String c, String d){
        StudentName = a;
        Subject1 = "English Language";
        Subject2 = "English Literature";
        Subject3 = "Mathematics";
        Subject4 = b;
        Subject5 = c;
        Subject6 = d;
    }

    public String whatGrade(int g){
        String grade = "";
        if (g <= 100 && g >= 90){
            grade = "A";
        }
        else if (g <= 89 && g >= 80){
            grade = "B";
        }
        else if (g <= 79 && g >= 70){
            grade = "C";
        }
        else if (g <= 69 && g >= 60){
            grade = "D";
        }
        else if (g <= 59 && g >= 50){
            grade = "E";
        }
        else if (g <= 49 && g >= 0){
            grade = "U";
        }
        else {
            grade = "Error";
        }
        return grade;
    }

    public String setLangGrade(String grade){
        G1 = grade;
        return G1;
    }

    public String setLitGrade(String grade){
        G2 = grade;
        return G2;
    }

    public String setMathGrade(String grade){
        G3 = grade;
        return G3;
    }

    public String set4Grade(String grade){
        G4 = grade;
        return G4;
    }

    public String set5Grade(String grade){
        G5 = grade;
        return G5;
    }

    public String set6Grade(String grade){
        G6 = grade;
        return G6;
    }

    public String toString(String a){
        a = StudentName;
        return StudentName;
    }

    public void setStu (String a, String b, String c, String d){
        StudentName = a;
        Subject1 = "English Language";
        Subject2 = "English Literature";
        Subject3 = "Mathematics";
        Subject4 = b;
        Subject5 = c;
        Subject6 = d;
    }

    public static String diploma(Student stuOne){


        String diploma = "";

        diploma = "THE UNIVERSITY OF WEST HAMPSHIRE"
                + "\n\tJUNE 2016"
                + "\n\nThis diploma is awarded to"
                + "\n\t" + stuOne.StudentName
                + "\n\nSUBJECT               GRADE\n";
        if (!stuOne.G1.equals("U"))
            diploma = diploma + stuOne.Subject1 + "\t" + stuOne.G1 + "\n";

        if (!stuOne.G2.equals("U"))
            diploma = diploma + stuOne.Subject2 + "\t" + stuOne.G2 + "\n";

        if (!stuOne.G3.equals("U"))
            diploma = diploma +stuOne.Subject3 + "\t\t" + stuOne.G3 + "\n";

        if (!stuOne.G4.equals("U"))
            diploma = diploma + stuOne.Subject4 + space(stuOne) + stuOne.G4 + "\n";

        if (!stuOne.G5.equals("U"))
            diploma = diploma + stuOne.Subject5 + space2(stuOne) + stuOne.G5 + "\n";

        if (!stuOne.G6.equals("U"))
            diploma = diploma + stuOne.Subject6 + space3(stuOne) + stuOne.G6 + "\n";

        return diploma;
    }

    public static String space(Student stuOne){
        int length4 = stuOne.Subject4.length();

        String space = "";

        if (length4 > 15)
            space = "\t";
        else if (length4 > 7 && length4 <= 15)
            space = "\t\t";
        else
            space = "\t\t\t";

        return space;
    }

    public static String space2(Student stuOne){
        int length5 = stuOne.Subject5.length();

        String space2 = "";

        if (length5 > 15)
            space2 = "\t";
        else if (length5 > 7 && length5 <= 15)
            space2 = "\t\t";
        else
            space2 = "\t\t\t";

        return space2;
    }

    public static String space3(Student stuOne){
        int length6 = stuOne.Subject6.length();

        String space3 = "";

        if (length6 > 15)
            space3 = "\t";
        else if (length6 > 7 && length6 <= 15)
            space3 = "\t\t";
        else
            space3 = "\t\t\t";

        return space3;
    }

    public static void main(String[] args){
        String a = "";
        String b = "";
        String c = "";
        String d = "";
        Student stuOne = new Student(a, b, c, d);
        boolean continues = true;
        Scanner scan = new Scanner(System.in);

        while (continues){
            System.out.println("What is your name?");
            a = scan.nextLine();
            System.out.println("What is your fourth subject?");
            b = scan.nextLine();
            System.out.println("What is your fifth subject?");
            c = scan.nextLine();
            System.out.println("What is your sixth subject?");
            d = scan.nextLine();

            stuOne.setStu(a, b, c, d);

            System.out.println("What was your grade for English Language?");
            int g = scan.nextInt();
            String grade = stuOne.whatGrade(g);
            stuOne.setLangGrade(grade);

            System.out.println("What was your grade for English Literature?");
            g = scan.nextInt();
            grade = stuOne.whatGrade(g);
            stuOne.setLitGrade(grade);

            System.out.println("What was your grade for Mathematics?");
            g = scan.nextInt();
            grade = stuOne.whatGrade(g);
            stuOne.setMathGrade(grade);

            System.out.println("What was your grade for " + stuOne.Subject4 + "?");
            g = scan.nextInt();
            grade = stuOne.whatGrade(g);
            stuOne.set4Grade(grade);

            System.out.println("What was your grade for " + stuOne.Subject5 + "?");
            g = scan.nextInt();
            grade = stuOne.whatGrade(g);
            stuOne.set5Grade(grade);

            System.out.println("What was your grade for " + stuOne.Subject6 + "?");
            g = scan.nextInt();
            grade = stuOne.whatGrade(g);
            stuOne.set6Grade(grade);

            System.out.println(diploma(stuOne));

            System.out.println("Do you want to input another person? True or false?");
            continues = scan.nextBoolean();
            System.out.println(continues);
            scan.nextLine();
        }
    }
}