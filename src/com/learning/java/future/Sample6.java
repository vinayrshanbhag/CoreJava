package com.learning.java.future;

import java.util.concurrent.CompletableFuture;

public class Sample6 {
    public static void main(String[] args) {


       CompletableFuture<Void> future1 =  CompletableFuture.supplyAsync(Sample6::generate)
                                                           .thenApply(Sample6::transform)
                                                           .thenAccept(Sample6::print);


        sleep(3000);

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
        //sleep(1000);
        return Math.random();
    }
}
