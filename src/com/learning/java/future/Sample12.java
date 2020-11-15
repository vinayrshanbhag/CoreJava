package com.learning.java.future;

import java.util.concurrent.CompletableFuture;

public class Sample12 {
    public static void main(String[] args) {

        CompletableFuture.supplyAsync(Sample12::generate)
                         .thenApply(Sample12::transform)
                         .exceptionally(Sample12::handleException)
                         .exceptionally(Sample12::handleExceptionAgain)
                         .thenAccept(Sample12::print);


    }

    private static Integer transform(Integer integer) {
        System.out.println("Transform called with....."+ integer);
        if(integer<100){
            throw new RuntimeException("Number is too low...");
        }
        return integer*2;


    }

    private static Integer handleException(Throwable throwable) {
        System.out.println("There was an exception");
        throw new RuntimeException("Propogated..");
    }

    private static Integer handleExceptionAgain(Throwable throwable) {
        System.out.println("This is an propogated exception");
        return 5;
    }

    private static void print(Integer integer) {
        System.out.println(integer);
    }

    private static Integer generate() {
        System.out.println("generate called..");
        return 20;
    }



}
