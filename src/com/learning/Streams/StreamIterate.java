package com.learning.Streams;


import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by vinayshanbhag on 3/26/18.
 */


class Generator{
    int next;
    public int generate(){
        return next++;
    }

    public Generator(int count){
        next = count;
    }
}
public class StreamIterate {

    public static void main(String[] args) {

        Generator generator = new Generator(20);

        Supplier supplier = ()->generator.generate();

        Stream.generate(generator::generate)
                .limit(10)
                .forEach(System.out::println);

          Stream.iterate(0, input->input+1)
                .filter(number->number%2==0)
                .limit(10)
                .forEach(System.out::println);





    }
}
