package com.learning.java8.excercisingfunctionalstyle.part2;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalSample {
   public static void main(String[] args) {
	
	   
	   
	   List<Double> sqrtOfFirst100Evens = Stream.iterate(1, e->e+1)
			                                    .filter(FunctionalSample::isEven)
			                                    .limit(100)
			                                    .map(Math::sqrt)
			                                    .collect(Collectors.toList());
	   
	   
}
   
   public static boolean isEven(int number) {
		return number%2==0;
	}
}
