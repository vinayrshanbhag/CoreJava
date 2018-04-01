package com.learning.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Created by vinayshanbhag on 3/25/18.
 */
public class StreamGenerate {

    public static void printSize(Stream stream){
        System.out.println(stream.count());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        printSize(numbers.stream());

        printSize(numbers.stream()
                         .filter(e->e%2==0));

        Random random = new Random();
        System.out.println(random.nextInt());

        // This is useful when we have our own generator
        Stream<Integer> stream = Stream.generate(()-> random.nextInt());

        stream.limit(5)
                .forEach(System.out::println);


        Stream<Integer> numbersStream = random.ints().boxed();

             numbersStream.limit(5)
                          .forEach(System.out::print);

        Stream<Long> longStream = random.longs().boxed();

        Stream<Double> doubleStream = random.doubles().boxed();



    }


}
