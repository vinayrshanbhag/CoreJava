package com.learning.java.future;

import java.util.concurrent.CompletableFuture;

public class Sample7 {
    public static void main(String[] args) {


        CompletableFuture.supplyAsync(Sample7::generate)
                         .thenApply(Sample7::transform)
                         .thenAccept(Sample7::print)
                         .thenRun(()->System.out.println("Hello I am  Done"));


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
        return Math.random();
    }
}
