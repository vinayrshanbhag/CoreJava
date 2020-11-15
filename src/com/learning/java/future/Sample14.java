package com.learning.java.future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Sample14 {


    public static CompletableFuture<String> fetchSymbol(int index){
        List<String> symbols = Arrays.asList("AMZN","GOOG","RELNCE");
        return CompletableFuture.supplyAsync(()-> symbols.get(index));
    }

    public static CompletableFuture<Double> getPrice(String symbol, double numberOfShares){
        return CompletableFuture.supplyAsync(()-> YahooFinance.getPrice(symbol))
                                .thenApply(price->price*numberOfShares);
    }

    public static void main(String[] args) throws InterruptedException {
        fetchSymbol(1)
                .thenCompose(symbol->getPrice(symbol,200))
                .thenAccept(System.out::println);

        Thread.sleep(5000);
    }
}
