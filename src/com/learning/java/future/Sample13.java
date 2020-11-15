package com.learning.java.future;

import java.util.concurrent.CompletableFuture;

public class Sample13 {

    public static void main(String[] args) throws Exception {

       /* getTotalNetAssetValue("GOOG",200)
                .thenCombine(getTotalNetAssetValue("AMZN",200),
                        (google,amazon)->google+amazon)
                       .thenAccept(totalNAV-> System.out.println(totalNAV));*/

       CompletableFuture<Double> googleNAV=  getTotalNetAssetValue("GOOG",200);
       CompletableFuture<Double> amznNAV = getTotalNetAssetValue("AMZN",200);

       googleNAV.thenCombine(amznNAV,Double::sum)
                .thenAccept(System.out::println);


        //Thread.sleep(5000);

    }

    public static CompletableFuture<Double> getTotalNetAssetValue(String ticker, int numberOfShares){
       return CompletableFuture.supplyAsync(()->YahooFinance.getPrice(ticker)*numberOfShares);
    }
}
