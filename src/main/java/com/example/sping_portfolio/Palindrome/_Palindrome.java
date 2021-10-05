package com.example.sping_portfolio.Palindrome;

import com.example.sping_portfolio.ConsoleUI.ConsoleMethods;

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
        long startTime = System.nanoTime();
        result = this.init(phrase);
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
