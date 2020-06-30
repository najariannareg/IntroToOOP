package com.company;

public abstract class Student implements Boxoqox{
    private String name;
    private double GPA;


    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Student(String name, double gpa){
        this.name = name;
        this.GPA = gpa;

    }
}
