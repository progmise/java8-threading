
package com.research24x7.threading.demos.basic;


public class RunnableLambdaSyntax {


    public RunnableLambdaSyntax() {

        super();
    }


    public static void main (String [] args) {

        Runnable runnable = () -> {

            for (int i = 0; i < 20; i++) {

                System.out.println (String.format ("Lambda %s is running %d", Thread.currentThread().getName(), i));
            }
            System.out.println ("End !!!");
        };

        Thread t1 = new Thread(runnable, "Homer Simpson");
        t1.start();

        Thread t2 = new Thread(runnable, "Bart Simpson");
        t2.start();

        Thread t3 = new Thread(runnable, "Lisa Simpson");
        t3.start();
    }
}