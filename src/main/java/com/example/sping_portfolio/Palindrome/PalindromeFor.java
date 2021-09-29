package com.example.sping_portfolio.Palindrome;

import java.util.Locale;

public class PalindromeFor extends _Palindrome {
    public PalindromeFor() {
        super();
    }
    public PalindromeFor(String phrase) {
        super(phrase);
    }

    @Override
    protected String init(String str) {
        super.name = "For";
        str = str.replaceAll("\\s", "");
        str = str.toLowerCase(Locale.ROOT);

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j))
                return "The phrase is not a palindrome.";
        }
        return "The phrase is a palindrome";
    }
}
