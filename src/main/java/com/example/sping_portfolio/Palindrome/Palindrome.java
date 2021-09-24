package com.example.sping_portfolio.Palindrome;

import java.util.Locale;

//Test phrase: A man a plan a canal Panama

public class Palindrome {
    public static String isPalindrome(String str)
    {
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

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man A plan A canal Panama"));
    }
}

/* Implementation of Palindrome Checker using a For loop

package com.example.sping_portfolio.Palindrome;

import java.util.Locale;

public class PalindromeFor {
    public static String isPalindromeFor(String str)
    {
        str = str.replaceAll("\\s", "");
        str = str.toLowerCase(Locale.ROOT);

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j))
                return "The phrase is not a palindrome.";
        }
        return "The phrase is a palindrome";
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeFor("A man A plan A canal Panama"));
    }
}

*/