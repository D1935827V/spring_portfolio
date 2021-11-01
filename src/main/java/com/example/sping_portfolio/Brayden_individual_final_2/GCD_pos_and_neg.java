package com.example.sping_portfolio.Brayden_individual_final_2;

public class GCD_pos_and_neg {
    public static void main(String[] args) {

        int n1 = -81, n2 = -153;

        // sets to positive
        n1 = (n1 > 0) ? n1 : -n1;
        n2 = (n2 > 0) ? n2 : -n2;

        while (n1 != n2) {

            if (n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }
    }
}