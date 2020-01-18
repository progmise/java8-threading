package com.research24x7.threading.demos.intermediate;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class RejectedTaskTest {


    public static void main(String[] args) {

        System.out.println ("Processors = " + Runtime.getRuntime().availableProcessors());

        final ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors
                .newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        RejectedTaskHandler handler=new RejectedTaskHandler();

        executor.setRejectedExecutionHandler(handler);

        for (int i=0; i<10; i++)
        {
            MyTask task=new MyTask("Task-"+i);
            executor.execute(task);
        }

        //shut down the executor so that new tasks will be rejected
        executor.shutdown();

        MyTask task = new MyTask("Rejected task");
        executor.execute(task);
    }
}