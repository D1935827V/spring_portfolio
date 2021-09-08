package com.example.sping_portfolio.Hackathon_2;

public class Student {
    public void  calcGrade(double test1, double test2, double test3) {
        double average = (test1 + test2 + test3)/3;
        if (average > 60) {
            System.out.println("you pass");
        }
        else{
            System.out.println("you fail");
        }
    }
    public static void main(String[] args){
        Student newStudent = new Student();
        newStudent.calcGrade(70,80,10);

    }
}
