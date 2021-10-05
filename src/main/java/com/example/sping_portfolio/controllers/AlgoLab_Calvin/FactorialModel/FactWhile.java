package com.example.sping_portfolio.controllers.AlgoLab_Calvin.FactorialModel;

public class FactWhile extends _Factorial {
    public FactWhile() {
        super();
    }
    public FactWhile(int nth) {
        super(nth);
    }

    /*
    Abstract Polymorphic "init()" method using While
    */
    @Override
    protected void init() {
        super.name = "While";
        // longer and more error prone "while" syntax is often best performer in this small scale test
        long limit = super.size;
        long[] f = new long[]{0, 1};
        int i = 1;
        while (limit-- > 0) {
            super.setData(f[1]);
            f = new long[]{f[1], f[1] * (i+1)};
            i++;
        }
    }

    /*
    Class method "main" with purpose of testing FibWhile
     */
    public static void main(String[] args) {
        _Factorial fibonacci = new FactWhile();
        fibonacci.print();
    }
}