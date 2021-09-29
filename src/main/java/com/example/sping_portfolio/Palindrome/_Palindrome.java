package com.example.sping_portfolio.Palindrome;

import com.example.sping_portfolio.ConsoleUI.ConsoleMethods;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;

import lombok.Getter;

@Getter
public abstract class _Palindrome {
    String name;
    Duration timeElapsed;

    /*
     Zero parameter constructor uses Telescoping technique to allow setting of the required value nth
     @param: none
     */
    public _Palindrome() {
        this("");
    }

    /*
     Construct the nth fibonacci number
     @param: nth number, the value is constrained to 92 because of overflow in a long
     */
    public _Palindrome(String phrase) {
        //initialize fibonacci and time algorithm
        Instant start = Instant.now();  // time capture -- start
        this.init(phrase);
        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);
    }

    /*
     Method is abstract as init() requires extender to define their own Fibonacci algorithm
     Method is protected as it is only authorized to someone who extends the class
     */
    protected abstract String init(String str);


    /*
     Custom Getter for timeElapsed in init process, timeElapsed.getNano() is part of Duration class
     */
    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }

    /*
     Console/Terminal supported print method
     */
    public void print() {
        ConsoleMethods.println("Init method = " + this.name);
        ConsoleMethods.println("Init time = " + this.getTimeElapsed());
    }
}
