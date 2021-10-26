package com.example.sping_portfolio.Palindrome;

import java.util.Locale;

public class PalindromeRecursive extends _Palindrome {
    public PalindromeRecursive() {
        super();
    }
    public PalindromeRecursive(String phrase) {
        super(phrase);
    }

    @Override
    protected String init(String phrase) {
        super.name = "Recursion";
        phrase = phrase.replaceAll("\\s", "");
        phrase = phrase.toLowerCase(Locale.ROOT);
        int n = phrase.length();
        if (n == 0) {
            return "The phrase is a palindrome";
        }
        else if (isPaliRec(phrase, 0, n - 1)) {
            return "The phrase is a palindrome";
        }
        else {
            return "The phrase is not a palindrome";
        }
    }

    public static boolean isPaliRec(String str, int i, int j) {
        if ((str.charAt(i)) != (str.charAt(j))) {
            return false;
        }
        if (i < j) {
            return isPaliRec(str, i + 1, j - 1);
        }
        return true;
    }
}
