package com.research24x7.threading.demos.basic;

public class MyThreadNamed extends Thread {


    public MyThreadNamed(String name) {

        super(name);
    }


    public void run () {

        for (int i = 0; i < 20; i++) {

            System.out.println (String.format ("Thread %s is running %d", this.getName(), i));
        }
        System.out.println ("End !!!");
    }
}
