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
    long timeElapsed;
    String result;

    public _Palindrome() {
        this("");
    }

    public _Palindrome(String phrase) {
        //initialize palindrome and time algorithm
        // Instant start = Instant.now();  // time capture -- start
        long startTime = System.nanoTime();
        result = this.init(phrase);
        // Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = System.nanoTime() - startTime;
    }

    protected abstract String init(String str);

    public long getTimeElapsed() {
        return timeElapsed;
    }

    public void print() {
        ConsoleMethods.println("Init method = " + this.name);
        ConsoleMethods.println("Init time = " + this.getTimeElapsed());
    }
}
