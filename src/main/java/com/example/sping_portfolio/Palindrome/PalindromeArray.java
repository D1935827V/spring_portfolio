package com.example.sping_portfolio.Palindrome;

import java.util.Locale;

public class PalindromeArray extends _Palindrome {
    public PalindromeArray() {
        super();
    }
    public PalindromeArray(String phrase) {
        super(phrase);
    }

    protected String init(String str) {
        super.name = "Array";
        str = str.replaceAll("\\s", "");
        str = str.toLowerCase(Locale.ROOT);

        char[] c = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            c[i] = str.charAt(i);
        }
        for (int i = 0, j = c.length - 1; i < j; i++, j--) {
            if (c[i] == c[j])
                return "The phrase is a palindrome.";
        }
        return "The phrase is not a palindrome";
    }
}
