package com.penn.thread.print;

/**
 * @author penn
 * @since 2019/12/19
 */
public class Test {
    public static void main(String[] args) {
        Num num = new Num();
        OddThread t1 = new OddThread(num);
        EvenThread t2 = new EvenThread(num);
        t1.start();
        t2.start();
    }
}
