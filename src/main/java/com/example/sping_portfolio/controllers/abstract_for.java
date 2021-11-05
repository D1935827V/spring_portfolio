package com.example.sping_portfolio.controllers;

public class abstract_for extends MiniLab6 {
    @Override
    public void executeAction() {
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