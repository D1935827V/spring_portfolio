package com.example.sping_portfolio.minilabs.factorial;

import java.time.Duration;

public abstract class parentFactorial{
    int rotations;
    Duration timeElapsed;
    static boolean forr=false;
    static boolean stream=false;
    static boolean whilee=false;
    static boolean recurse=false;
    int x = 1;
    static int iter;
    public abstract Integer factorial();
    public void print() {
        System.out.println("Factorial = " + x);
    }
}
