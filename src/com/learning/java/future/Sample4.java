package com.learning.java.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

import static com.learning.java.future.Sample2.sleep;

public class Sample4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //ForkJoinPool pool = new ForkJoinPool(10);

        //CompletableFuture.runAsync(()-> System.out.println("Task Running...." + Thread.currentThread()));

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(new Supplier<Integer>() {
             public Integer get(){
                 System.out.println("Called..."+ Thread.currentThread());
                 sleep(500);
                 return 2;
            }
        });

        System.out.println("In main.."+Thread.currentThread());
        //System.out.println(future.get());
        sleep(1000);
        System.out.println(future.getNow(-1));
        System.out.println("Here..");

    }
}
