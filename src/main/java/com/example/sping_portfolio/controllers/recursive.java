package com.example.sping_portfolio.controllers;

public class recursive {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int k) {
        if (k > 0) {
            return 2 * sum(k - 1);
        } else {
            return 1;
        }
    }
}
