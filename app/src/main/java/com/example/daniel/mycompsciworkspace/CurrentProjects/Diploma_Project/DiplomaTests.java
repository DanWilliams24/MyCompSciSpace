package com.example.daniel.mycompsciworkspace.CurrentProjects.Diploma_Project;

/**
 * Created by Daniel on 12/7/17.
 */

public class DiplomaTests {
    public static void main(String[] args){
        Subject Physics = new Subject("Physics",85);
        Subject Comp_Sci = new Subject("Computer Science",100);
        Subject Art = new Subject("Art", 89);
        Subject[] Elective_Subjects = {Physics,Comp_Sci,Art};

        Student stuOne = new Student("Daniel Williams", Elective_Subjects);
        stuOne.setLangGrade(79);
        stuOne.setLiteratureGrade(82);
        stuOne.setMathGrade(91);

        Diploma diploma1 = new Diploma(stuOne,12,2020);
        System.out.println(diploma1.GenCertificate());
    }
}
