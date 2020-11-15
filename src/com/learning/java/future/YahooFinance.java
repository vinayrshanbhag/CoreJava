package com.learning.java.future;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class YahooFinance {


    public static double getPrice(final String ticker) {
        try {
          if(ticker.equalsIgnoreCase("GOOG")){
              Thread.sleep(1000);
          }

            return 23d;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
