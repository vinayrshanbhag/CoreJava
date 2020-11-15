package com.learning.java.future;

import java.util.concurrent.*;


public class Sample2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Integer> result = executorService.submit(() -> process());
        //sleep(4000);
        result.cancel(false);
//        System.out.println(result.isDone());

//        sleep(10000);

        if(result.isCancelled()){
            System.out.println(result.get());
        }
        else{
            System.out.println("Task Cancelled");
        }



        System.out.println(result.get());


//        System.out.println(result.isDone());

        executorService.shutdown();
        executorService.awaitTermination(20, TimeUnit.SECONDS);



    }

    private static int process() {
        System.out.println("Starting ...");
        sleep(10000);
        System.out.println("Done work");
        return 2;
    }


    public static boolean sleep(int ms) {
        try {
            Thread.sleep(ms);
            return true;
        } catch (Exception ex) {
            System.out.println("Thread Interupted..");
            return false;
        }
    }
}
