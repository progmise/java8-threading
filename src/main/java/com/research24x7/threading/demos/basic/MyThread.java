package com.research24x7.threading.demos.basic;

public class MyThread extends Thread {


    public MyThread () {

        super();
    }


    public void run () {

        for (int i = 0; i < 20; i++) {

            System.out.println (i);
        }
        System.out.println ("End !!!");
    }
}
