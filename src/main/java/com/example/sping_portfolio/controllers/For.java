package com.example.sping_portfolio.controllers;

public class For {
    public static void main(String[] args) {
        System.out.print(geometric(4));
    }
    public static int geometric(int i) {
        int result = 1;
        for (int pow = 0; pow < i; pow++) {
            result = 2 * result;
        }
        return result;
    }

}
