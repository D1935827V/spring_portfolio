package com.example.sping_portfolio.controllers.AlgoLab_Calvin.FactorialModel;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class FactStream extends _Factorial {
    public FactStream() {
        super();
    }
    public FactStream(int nth) {
        super(nth);
    }

    /*
    Abstract Polymorphic "init()" method using Stream and Lambda expressions
    */
    @Override
    protected void init() {
        super.name = "Stream";
        // Stream iterates using lambda "->" syntax unil ".limit" is reached
        // Streams and Lambda have been added to more recent versions of Java, this will NOT be on AP Test
        // Streams are prevalent in Big Data, in this example it seems to perform the worst

        AtomicInteger i = new AtomicInteger(1);
        Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[1] * ((i.getAndIncrement()) +1)})
                .limit(super.size)
                .forEach(f -> super.setData(f[1]));

    }

    /*
    Class method "main" with purpose of testing FibStream
     */
    public static void main(String[] args) {
        _Factorial fibonacci = new FactStream();
        fibonacci.print();
    }
}