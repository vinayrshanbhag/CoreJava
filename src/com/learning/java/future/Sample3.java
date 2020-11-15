package com.learning.java.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Sample3 {


    private static int process(int max, int index) {
        System.out.println("Starting task"+ index);
        sleep((max-index)*10000);
        System.out.println("Done work"+ index);
        return index;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        int max =10;

        List<Future<Integer>> futures = new ArrayList<>();

        for(int i =0;i<max;i++){
            int index=i;
//            Future<Integer> result = executorService.submit(()-> process(max,index));
            futures.add(executorService.submit(()-> process(max,index)));
//            System.out.println(result.get());
        }

        for(Future<Integer> future: futures){
            System.out.println(future.get());
        }


        executorService.shutdown();
        executorService.awaitTermination(20, TimeUnit.SECONDS);

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
