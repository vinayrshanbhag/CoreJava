package com.learning.Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by vinayshanbhag on 3/27/18.
 */
public class IsPrimeSample {

    public static boolean isPrime(Integer number){
        return number >1 && IntStream.range(2,number)
                                     .noneMatch(i-> number%i==0);

    }

    public static void main(String[] args) {

        System.out.println(isPrime(7));
        System.out.println(isPrime(8));

        //Find the sum of all sqrt of all  n prime number starting with K

        compute(121, 52);

    }

    private static Double compute(int starting, int n) {

        return Stream.iterate(starting, input-> input+1)
                     .filter(IsPrimeSample::isPrime)
                     .mapToDouble(Math::sqrt)
                     .limit(n)
                     .sum();
    }


}
