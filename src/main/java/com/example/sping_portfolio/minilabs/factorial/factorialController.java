package com.example.sping_portfolio.minilabs.factorial;

public class factorialController {


    public static void main(String[] args) {

        parentFactorial fact1 = new factFor();
        parentFactorial fact2 = new factWhile();
        parentFactorial fact3 = new factRecurse();

        parentFactorial.forr = true;
        parentFactorial.whilee = true;
        parentFactorial.recurse = true;

        System.out.println("For Loop");
        if (parentFactorial.forr) {
            fact1.factorial();
            fact1.print();
        }

        System.out.println("While Loop");
        if (parentFactorial.whilee) {
            fact2.factorial();
            fact2.print();
        }

        System.out.println("Recursion");
        if (parentFactorial.recurse) {
            fact3.factorial();
            fact3.print();
        }
    }
}
