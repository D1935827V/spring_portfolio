package com.example.sping_portfolio.Hackathon_1;
import java.util.*;
public class Calvin_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream

        System.out.print("Enter first test score: ");
        double test1 = sc.nextInt();
        System.out.print("Enter second test score: ");
        double test2 = sc.nextInt();
        System.out.print("Enter third test score: ");
        double test3 = sc.nextInt();
        System.out.print("Enter fourth test score: ");
        double test4 = sc.nextInt();
        System.out.print("Enter the score of your final: ");
        double _final_ = sc.nextInt();
        double total_avg = (test1+test2+test3+test4+_final_)/5;
        double a1 = (test1+test2)/2;
        double a2 = (test3+test4)/2;
        System.out.println("gp1: "+ a1);
        System.out.println("gp2: "+a2);
        System.out.println("Final: "+ _final_);
        System.out.println("Total= " + total_avg);
    }
}
