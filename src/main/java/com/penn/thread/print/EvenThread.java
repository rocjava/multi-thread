package com.penn.thread.print;

/**
 * @author penn
 * @since 2019/12/19
 */
public class EvenThread extends Thread {

    private Num num;

    public EvenThread(Num num){
        this.num = num;
    }

    @Override
    public void run(){
        num.printEven();
    }
}
