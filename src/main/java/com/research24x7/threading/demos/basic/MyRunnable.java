package com.research24x7.threading.demos.basic;

public class MyRunnable implements Runnable  {


    public MyRunnable() {

        super ();
    }


    public void run() {

        for (int i = 0; i < 20; i++) {

            System.out.println (String.format ("Runnable %d is running %d", Thread.currentThread().getId(), i));
        }
        System.out.println ("End !!!");
    }
}