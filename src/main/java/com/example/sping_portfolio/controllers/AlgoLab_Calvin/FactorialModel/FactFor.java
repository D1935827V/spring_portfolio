package com.example.sping_portfolio.controllers.AlgoLab_Calvin.FactorialModel;

public class FactFor extends _Factorial {
    // zero and one argument constructors, both defer to super
    public FactFor() { super(); }
    public FactFor(int nth) {
        super(nth);
    }

    /*
    Abstract Polymorphic "init()" method using For
     */
    @Override
    protected void init() {
        super.name = "For";
        long limit = super.size;
        int i = 0;
        // for loops are likely the most common iteration structure, all the looping facts are in one line
        for (long[] f = new long[]{0, 1}; limit-- > 0; f = new long[]{f[1], f[1] * (i+1)}) {
            super.setData(f[1]);
            i++;
        }


    }

    /*
    Class method "main" with purpose of testing FibFor
     */
    public static void main(String[] args) {
        _Factorial fibonacci = new FactFor(); // "FibFor" is used as initializer for the "_Fibonacci fibonacci"  object
        fibonacci.print();
    }
}