package com.learning.java.future;

import java.sql.Time;
import java.util.*;
import java.util.concurrent.*;


public class Sample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(100);


       /* executorService.submit(() ->
                System.out.println("Some task running in "+ Thread.currentThread()) );*/

        Future<Integer> result=
        executorService.submit(() -> {

            System.out.println("Doing work..."+ Thread.currentThread());
            Thread.sleep(5000);
            return 2;
        });

        System.out.println("In Main" +result.get());


        executorService.shutdown();
        executorService.awaitTermination(10000, TimeUnit.SECONDS);

    }
}
