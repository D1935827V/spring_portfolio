package com.example.sping_portfolio.Palindrome;

import java.util.Locale;

// Test phrase: A man a plan a canal Panama

public class PalindromeWhile extends _Palindrome {
    public PalindromeWhile() {
        super();
    }

    public PalindromeWhile(String phrase) {
        super(phrase);
    }

    protected String init(String str)
    {
        super.name = "While";

        str = str.replaceAll("\\s", "");
        str = str.toLowerCase(Locale.ROOT);
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return "The phrase is not a palindrome.";
            i++;
            j--;
        }
        return "The phrase is a palindrome";
    }
}