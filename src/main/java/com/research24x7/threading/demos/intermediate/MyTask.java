
package com.research24x7.threading.demos.intermediate;


import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;


public class MyTask implements Runnable  {

    private final String name;

    public MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("%s: Task %s: Created on: %s\n",
                Thread.currentThread().getName(),
                name,
                LocalDateTime.now());
        try
        {
            Long duration = (long)(Math.random()*10);

            System.out.printf("%s: Task %s: Doing a task during %d seconds\n",
                    Thread.currentThread().getName(),
                    name,
                    duration);

            TimeUnit.SECONDS.sleep(duration);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.printf("%s: Task %s: Finished on: %s\n",
                Thread.currentThread().getName(),
                name,
                LocalDateTime.now());
    }

    @Override
    public String toString() {
        return "[name=" + name + "]";
    }
}