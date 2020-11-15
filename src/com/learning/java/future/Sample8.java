package com.learning.java.future;

import java.util.concurrent.CompletableFuture;

public class Sample8 {
    public static void main(String[] args) {

        CompletableFuture<Double> completableFuture = new CompletableFuture<>();

        System.out.println(completableFuture);

        process(completableFuture);

        System.out.println(completableFuture);

        System.out.println("Pipeline built");

        completableFuture.complete(6d);

        System.out.println(completableFuture);

        sleep(3000);
        System.out.println("Done");

    }

    public static void process(CompletableFuture<Double> future){
        future.thenApply(Sample8::transform)
              .thenAccept(Sample8::print);
    }


    public static Double transform(Double doubleValue)
    {
        System.out.println("Transform.....");
        return 2*doubleValue ;
    }


    private static void print(Double number)
    {
        System.out.println(number.toString());
    }

    private static void sleep(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static double generate(){
        System.out.println(">> generate...");
        return Math.random();
    }
}
