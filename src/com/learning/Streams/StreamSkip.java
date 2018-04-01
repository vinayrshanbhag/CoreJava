package com.learning.Streams;

import java.util.Arrays;
import java.util.List;

/**
 * Created by vinayshanbhag on 3/25/18.
 */
public class StreamSkip {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,12,1,4,5,6,7,8,9);

        System.out.println( numbers.stream()
                                    .map(e->e*2)
                                    .sorted()
                                    .findFirst()
                                    .orElse(0));


        System.out.println(numbers.stream()
                .map(e->e*2)
                .sorted()
                .skip(4)
                .findFirst()
                .orElse(0));


    }
}
