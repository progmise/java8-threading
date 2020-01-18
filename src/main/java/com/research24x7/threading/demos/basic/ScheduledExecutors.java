
package com.research24x7.threading.demos.basic;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutors {


    public static void main(String[] args) throws Exception {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        Runnable task1 = () -> {
            try {

                System.out.println("Executing Task 1 At " + System.nanoTime());
                Thread.sleep(10000);
            } catch (Exception e) {

                e.printStackTrace();
            }
        };

        Runnable task2 = () -> {
            try {

                System.out.println("Executing Task 2 At " + System.nanoTime());
                Thread.sleep(15000);
            } catch (Exception e) {

                e.printStackTrace();
            }
        };

        Runnable task3 = () -> {
            System.out.println("Executing Task 3 At " + System.nanoTime());
        };

        System.out.println("Submitting task 1 at " + System.nanoTime() + " to be executed after 5 seconds.");
        scheduledExecutorService.schedule(task1, 5, TimeUnit.SECONDS);

        System.out.println("Submitting task 2 at " + System.nanoTime() + " to be executed after 5 seconds.");
        scheduledExecutorService.schedule(task2, 5, TimeUnit.SECONDS);

        System.out.println("Submitting task 3 at " + System.nanoTime() + " to be executed after 5 seconds.");
        scheduledExecutorService.schedule(task3, 5, TimeUnit.SECONDS);

        System.out.println("Shutdown...");
        scheduledExecutorService.shutdown();
        scheduledExecutorService.awaitTermination(1, TimeUnit.HOURS);
    }
}
