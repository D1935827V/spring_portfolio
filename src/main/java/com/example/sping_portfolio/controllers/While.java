package com.example.sping_portfolio.controllers;

public class While {
    public static void main(String[] args) {
        System.out.print(geometric(4));
    }
    public static int geometric(int i) {
        int result = 1;
        int pow = 1;
        while(pow < i) {
            result = 2 * result;
            pow ++;
        }
        return result*2;
    }

}
