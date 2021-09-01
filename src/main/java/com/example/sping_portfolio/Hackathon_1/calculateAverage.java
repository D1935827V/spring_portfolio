package com.example.sping_portfolio.Hackathon_1;

public class calculateAverage {
    public static void main(String[] args) {
        double grade1 = 93;
        double grade2 = 88;
        double grade3 = 91;
        double grade4 = 94;
        double grade5 = 87;
        double avg12 = (grade1 + grade2)/2;
        double avg34 = (grade3 + grade4)/2;
        double finalAvg = (grade1 + grade2 + grade3 + grade4 + grade5)/5;
        System.out.println("Grading Period 1: " + avg12);
        System.out.println("Grading Period 2: " + avg34);
        System.out.println("Final: " + grade5);
        System.out.println("Average: " + finalAvg);
    }
}
/* Written by Nicholas */