package com.example.daniel.mycompsciworkspace.CurrentProjects.Diploma_Project;

/**
 * Created by Daniel on 12/6/17.
 */

public class Student {
    private String name;
    private Subject[] subjects;
    private Subject[] electives;
    private String grades;


    public Student(){
        this.name = "valid name";
        this.subjects[0] = new Subject("English Language");
        this.subjects[1] = new Subject("English Literature");
        this.subjects[2] = new Subject("Mathematics");
        this.electives = new Subject[3];
        this.grades = "XXXXXX";
    }

    public Student(String name){
        this.name = name;
        this.subjects[0] = new Subject("English Language");
        this.subjects[1] = new Subject("English Literature");
        this.subjects[2] = new Subject("Mathematics");
        this.electives = new Subject[3];
        this.grades = "XXXXXX";
    }

    public Student(String name, Subject[] electives){
        this.subjects[0] = new Subject("English Language");
        this.subjects[1] = new Subject("English Literature");
        this.subjects[2] = new Subject("Mathematics");
        this.name = name;
        this.electives = electives;
    }

    public Student(Student other){
        this.grades = other.grades;
        this.name = other.name;
        this.subjects = other.subjects;
    }

    public void setLangGrade(double marks){
        Subject English_Lang = this.subjects[0];
        English_Lang.setMarks(marks);
    }
    public void setLiteratureGrade(double marks){
        Subject English_Lit = this.subjects[1];
        English_Lit.setMarks(marks);
    }
    public void setMathGrade(double marks){
        Subject math = this.subjects[2];
        math.setMarks(marks);
    }

    public void setElectives(Subject[] electives) {
        this.electives = electives;
    }

    public void setElectiveGrade(String elective,double marks){
        elective = elective.toLowerCase();
        if(elective == electives[0].getName()){
            electives[0].setMarks(marks);

        }else if(elective == electives[1].getName()){
            electives[1].setMarks(marks);

        }else if(elective == electives[2].getName()){
            electives[2].setMarks(marks);

        }else{
            throw new IllegalArgumentException("Unknown Elective:" + elective);
        }
    }

    public String getName() {
        return name;
    }
}
