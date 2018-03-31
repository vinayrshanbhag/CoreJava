package com.learning.Streams;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by vinayshanbhag on 3/25/18.
 */
public class StreamOfAgony {

    public static void main(String[] args) {
        String[] names = new String[]{"Tom" , "Jerry"};

        Stream.of(names)
                .forEach(System.out::println);

        Stream.of("Turing","Church", "Curry")
                .forEach(System.out::println);

        //It is a mess here. It doesn't expect array of primitives
        //dont use Stream.of(T) when we have primitives type

        int[] numbers = new int[]{1,2,3};
        Stream.of(numbers)
                .forEach(System.out::print);

        Arrays.stream(numbers)
                .forEach(System.out::print);

        Stream.of(1,2,3)
                .forEach(System.out::print);

    }


}
