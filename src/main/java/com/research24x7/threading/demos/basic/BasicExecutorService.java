
package com.research24x7.threading.demos.basic;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BasicExecutorService {


    public BasicExecutorService() {

        super();
    }


    public static void main (String [] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(new Runnable() {

            public void run() {

                try {

                    for (int i=0; i<20; i++) {

                        System.out.println("i=" + i);
                    }

                    System.out.println("Waiting...");
                    Thread.sleep(5000);
                    System.out.println("Finishing...");

                } catch (Exception e){

                    e.printStackTrace();
                }
            }
        });

        executorService.shutdown();
        System.out.println("Shutdown...");
    }
}