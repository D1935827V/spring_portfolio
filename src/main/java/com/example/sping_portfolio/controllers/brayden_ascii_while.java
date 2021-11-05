package com.example.sping_portfolio.controllers;

public class brayden_ascii_while extends MiniLab6 {
    @Override
    public void executeAction() {
        System.out.print(geometric(4));
    }

    public static int geometric(int i) {
        int result = 1;
        int pow = 1;
        while (pow < i) {
            result = 2 * result;
            pow++;
        }
        return result * 2;
    }
}

