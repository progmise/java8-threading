
package com.research24x7.threading.demos.basic;


public class ThreadLambdaSyntax {


    public ThreadLambdaSyntax() {

        super();
    }


    public static void main (String [] args) {

        Thread t1 = new Thread(() -> {

            for (int i = 0; i < 20; i++) {

                System.out.println (String.format ("Lambda %s is running %d", Thread.currentThread().getName(), i));
            }
            System.out.println ("End !!!");
        }, "Homer Simpson");

        Thread t2 = new Thread(() -> {

            for (int i = 0; i < 20; i++) {

                System.out.println (String.format ("Lambda %s is running %d", Thread.currentThread().getName(), i));
            }
            System.out.println ("End !!!");
        }, "Bart Simpson");

        Thread t3 = new Thread(() -> {

            for (int i = 0; i < 20; i++) {

                System.out.println (String.format ("Lambda %s is running %d", Thread.currentThread().getName(), i));
            }
            System.out.println ("End !!!");
        }, "Lisa Simpson");



        t1.start();

        t2.start();

        t3.start();
    }
}