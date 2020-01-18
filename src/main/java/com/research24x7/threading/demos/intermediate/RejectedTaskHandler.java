package com.research24x7.threading.demos.intermediate;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectedTaskHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

        System.out.printf("RejectedTaskHandler: The task %s has been rejected", r.toString());
    }
}