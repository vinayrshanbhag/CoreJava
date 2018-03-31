package com.learning.Streams;

import java.util.Arrays;
import java.util.List;

/**
 * Created by vinayshanbhag on 3/25/18.
 */
public class StreamLimit {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,3,6,23,45,67,76,83);

        //Total the double of 7 values.


        System.out.println(numbers.stream()
                                  .limit(1)
                                  .mapToInt(e->e*2)
                                  .sum());

    }
}
