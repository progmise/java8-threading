
package com.research24x7.threading.demos.basic;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class BasicExecutorServiceCallable {


    public BasicExecutorServiceCallable() {

        super();
    }


    public static void main (String [] args) throws Exception {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future future = executorService.submit(new Callable() {

            public Object call() throws Exception {

                int r=0;
                try {

                    for (int i=0; i<20; i++) {

                        System.out.println("i=" + i);
                        r = r + i;
                    }

                    System.out.println("Waiting...");
                    Thread.sleep(5000);
                    System.out.println("Finishing...");

                } catch (Exception e){

                    e.printStackTrace();
                }

                return r;
            }
        });

        System.out.println("future.get() = " + future.get());

        executorService.shutdown();
        System.out.println("Shutdown...");
    }
}