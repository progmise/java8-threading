
package com.research24x7.threading.demos.basic;


public class Thread2LambdaSyntax {


    public Thread2LambdaSyntax() {

        super();
    }


    public static void main (String [] args) {

        new Thread(() -> {

            for (int i = 0; i < 20; i++) {

                System.out.println (String.format ("Lambda %s is running %d", Thread.currentThread().getName(), i));
            }
            System.out.println ("End !!!");
        }, "Homer Simpson").start();

        new Thread(() -> {

            for (int i = 0; i < 20; i++) {

                System.out.println (String.format ("Lambda %s is running %d", Thread.currentThread().getName(), i));
            }
            System.out.println ("End !!!");
        }, "Bart Simpson").start();

        new Thread(() -> {

            for (int i = 0; i < 20; i++) {

                System.out.println (String.format ("Lambda %s is running %d", Thread.currentThread().getName(), i));
            }
            System.out.println ("End !!!");
        }, "Lisa Simpson").start();
    }
}