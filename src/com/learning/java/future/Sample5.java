package com.learning.java.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Consumer;

public class Sample5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

      ForkJoinPool generatePool = new ForkJoinPool(10);
//      CompletableFuture.supplyAsync(Sample5::generate)
//                       .thenAccept(Sample5::print);

        ForkJoinPool taskPool = new ForkJoinPool(10);

        CompletableFuture.supplyAsync(Sample5::generate,generatePool)
                         .thenAcceptAsync(Sample5::print);


      //  System.out.println(future.get());
       // future.thenAccept(System.out::println);

        System.out.println("In Main");
        sleep(4000);

    }

    private static void print(Integer integer) {
        System.out.println(integer.toString()+ Thread.currentThread());
    }

    private static void sleep(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int generate(){
        System.out.println(">> generate..."+ Thread.currentThread());
        sleep(1000);
        return 2;
    }
}
