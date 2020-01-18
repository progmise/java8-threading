package com.research24x7.threading.demos.basic;

public class MyThreadId extends Thread {


    public MyThreadId() {

        super();
    }


    public void run () {

        for (int i = 0; i < 20; i++) {

            System.out.println (String.format ("Thread %d is running %d", Thread.currentThread().getId(), i));
        }
        System.out.println ("End !!!");
    }
}
