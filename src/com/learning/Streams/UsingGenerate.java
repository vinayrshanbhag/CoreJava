package com.learning.Streams;

import java.util.Random;
import java.util.stream.Stream;

/**
 * Created by vinayshanbhag on 3/26/18.
 */

class FibonacciSeries{

    int next(){
        return 0;
    }

}
public class UsingGenerate {




    public static void main(String[] args) {

        FibonacciSeries series = new FibonacciSeries();



        Random random = new Random();



        Stream.generate(random::nextInt)
                .limit(10)
                .forEach(System.out::print);


        random.ints()
                .limit(10)
                .forEach(System.out::print);
    }
}
