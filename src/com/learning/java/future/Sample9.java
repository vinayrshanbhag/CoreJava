package com.learning.java.future;

import java.util.concurrent.CompletableFuture;

public class Sample9
{
    public static void main(String[] args) {

        CompletableFuture<Double> completableFuture = new CompletableFuture<>();


        report(completableFuture);
        process(completableFuture);

        report(completableFuture);


        System.out.println("Pipeline built");

        report(completableFuture);
        completableFuture.complete(6d);
        completableFuture.cancel(true);
        report(completableFuture);




    }


    public static void report(CompletableFuture<Double> future){
        System.out.println("Done : "+ future.isDone());
        System.out.println("IsCancelled"+ future.isCancelled());
    }

    public static void process(CompletableFuture<Double> future){
        future.thenApply(Sample9::transform)
              .thenAccept(Sample9::print);
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
