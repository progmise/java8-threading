
package com.research24x7.threading.demos.basic;


import java.util.Random;
import java.util.concurrent.TimeUnit;


public class ThreadLambda3Syntax {


    public ThreadLambda3Syntax() {

        super();
    }


    public static void main (String [] args) {

        Runnable t = () -> {
            try {

                Random rand = new Random();
                int time = rand.nextInt((20 - 4) + 1) + 4;

                String name = Thread.currentThread().getName();
                System.out.println(String.format ("Sleeping %d %s ", time, name));
                TimeUnit.SECONDS.sleep(time);
                System.out.println(String.format ("Starting %s ", name));
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        };


        Thread t1 = new Thread(t, "Homer Simpson");
        Thread t2 = new Thread(t, "Bart Simpson");
        Thread t3 = new Thread(t, "Lisa Simpson");


        t1.start();
        t2.start();
        t3.start();
    }
}