package com.penn.thread.temp;

/**
 * @author penn
 * @since 2019/12/19
 */
public class Tool {
    public void test() throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        this.wait();
    }
}
