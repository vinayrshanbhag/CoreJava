package com.learning.java.future;

import java.util.concurrent.CompletableFuture;

public class Sample15 {
    public static void main(String[] args) throws Exception {

       /* fetchStockInfo("GOOG")
                .applyToEither(fetchStockInfo("AMZN"),stockInfo -> stockInfo.symbol)
                .thenAccept(System.out::println);*/

        fetchStockInfo("GOOG")
                .acceptEither(fetchStockInfo("AMZN"),(stockInfo -> System.out.print(stockInfo.symbol)));

        Thread.sleep(1000);


    }


    public static CompletableFuture<StockInfo> fetchStockInfo(String symbol){
        return CompletableFuture.supplyAsync(()-> YahooFinance.getPrice(symbol))
                                .thenApply(price->new StockInfo(symbol,price));
    }
}
