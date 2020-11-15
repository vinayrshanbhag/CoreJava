package com.learning.java.future;

import java.util.concurrent.CompletableFuture;

public class Sample11 {

    public static void main(String[] args) {
       /* CompletableFuture<Integer> future = CompletableFuture.supplyAsync(Sample11::generate);
                                                    // .thenAccept(Sample11::print);

        future.exceptionally(Sample11::handleException)
              .thenAccept(Sample11::print);*/

        CompletableFuture<Integer> future1 = new CompletableFuture<>();
        future1.thenAccept(Sample11::print);
       // future1.complete(1);
        future1.completeExceptionally(new RuntimeException("Completed on exception"));
    }

    private static Integer handleException(Throwable throwable) {
        System.out.println("There was an exception");
        throwable.printStackTrace();
        //throw new RuntimeException(throwable);
        return 5;
    }

    private static void print(Integer integer) {
        System.out.println(integer);
    }

    private static Integer generate() {
        throw new RuntimeException("An Exception occurred while generating");
        //return 2;
    }
}
