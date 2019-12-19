package com.penn.thread.print;

/**
 * @author penn
 * @since 2019/12/19
 */
public class OddThread extends Thread {
    private Num num;

    public OddThread(Num num){
        this.num = num;
    }

    @Override
    public void run(){
        num.printOdd();
    }
}
