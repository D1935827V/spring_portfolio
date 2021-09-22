package com.example.sping_portfolio.Palindrome;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String str)
    {
        str = str.replaceAll("\\s", "");
        str = str.toLowerCase(Locale.ROOT);
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase: ");

        String str = input.nextLine();

        //Test phrase: A man a plan a canal Panama
        if (isPalindrome(str))
            System.out.print("The phrase is a palindrome.");
        else
            System.out.print("The phrase is not a palindrome.");
    }
}