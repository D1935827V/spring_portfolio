package com.example.sping_portfolio.controllers.AlgoLab_Calvin.FactorialModel;

public class FactRecurse extends _Factorial {
    public FactRecurse() {
        super();
    }
    public FactRecurse(int nth) {
        super(nth);
    }
    int i = 1;
    /*
    Abstract Polymorphic "init()" method using Recursion
    */
    @Override
    protected void init() {
        //setup for recursion
        super.name = "Recursion";
        long limit = super.size;
        long[] f = new long[]{0, 1};

        initRecurse(limit,f);       // recursion is redirected
    }
    /*
    Recursive methods contains an escape, in this  "base condition" with a limit
    VERY IMPORTANT... recursion requires pre-decrement, post-decrement will not occur until unstacking
     */
    private void initRecurse(long limit, long[] f) {
        if (limit == 0) return;                                 //exit condition
        super.setData(f[1]);
        i++;
        // observe this syntax and function, many think of recursion as another way to do iteration
        initRecurse(--limit, new long[]{f[1], f[1] * (i+1)});
    }

    /*
    Class method "main" with purpose of testing FibRecurse
     */
    public static void main(String[] args) {

        _Factorial fibonacci = new FactRecurse();  // "FibRecurse" is used as initializer for the "_Fibonacci fibonacci"  object
        fibonacci.print();

    }
}