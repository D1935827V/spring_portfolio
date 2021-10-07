package com.example.sping_portfolio.Algorithm;

import java.util.Scanner;
public class BraydenFactorial
{
    public static void main(String args[])
    {
        int n, c, f = 1;

        System.out.println("enter a number");
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        if (n < 0)
            System.out.println("enter a positive number");
        else
        {
            for (c = 1; c <= n; c++)
                f = f*c;

            System.out.println("factorial of your number "+n+" is = "+f);
        }
    }
    public static int factorial(int n){
        int c, f = 1;
        if (n < 0)
            return -1;
        else
        {
            for (c = 1; c <= n; c++)
                f = f*c;

            return f;
        }
    }
}
