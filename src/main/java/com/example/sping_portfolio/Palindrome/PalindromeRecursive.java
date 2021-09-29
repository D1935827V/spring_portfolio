package com.example.sping_portfolio.Palindrome;

import java.util.Locale;

public class PalindromeRecursive {
    public static boolean isPaliRec(String str, int i, int j) {
        if (i == j) {
            return true;
        }
        if ((str.charAt(i)) != (str.charAt(j))) {
            return false;
        }
        if (i < j + 1) {
            return isPaliRec(str, i + 1, j - 1);
        }
        return true;
    }
    public static String isPalindromeRecursive(String phrase) {
        phrase = phrase.replaceAll("\\s", "");
        phrase = phrase.toLowerCase(Locale.ROOT);
        int n = phrase.length();
        if (n == 0) {
            return "The phrase is a Palindrome";
        }
        else if (isPaliRec(phrase, 0, n - 1)) {
            return "The phrase is a Palindrome";
        }
        else {
            return "The phrase is not a Palindrome";
        }
    }

    public static void main(String[] args) {
        String test = "rotor";
        System.out.println(isPalindromeRecursive(test));
    }
}