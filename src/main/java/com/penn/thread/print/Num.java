package com.penn.thread.print;

/**
 * @author penn
 * @since 2019/12/19
 */
public class Num {

    private volatile static boolean onOff = true;

    private volatile static  int num = 1;

    private final static int MAX_NUM = 100;


    public void printOdd(){
        while(num <= MAX_NUM){
            synchronized (this){
                try {
                    if(onOff){
                        this.notify();
                        System.out.println(Thread.currentThread().getName()+ ":" + num);
                        num ++;
                        onOff = false;

                    }else{
                        this.wait();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

        }
    }

    public void printEven(){

        while (num <= MAX_NUM){
            synchronized (this){
                try {
                    if(!onOff){
                        this.notify();
                        System.out.println(Thread.currentThread().getName()+ ":" + num);
                        num ++;
                        onOff = true;
                    }else{
                        this.wait();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

        }

    }
}
