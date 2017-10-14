package com.learning.java8.fundfunctionInterfaces.functionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceSample {

	public static void main(String[] args) {
		
		
	   Function<Integer, Double> doubleIt = value -> value*2.0;
	   
	   System.out.println(doubleIt.apply(4));
	   
	   List<String> names = Arrays.asList("Joe","Raju","Scott");
	   
	   Function<String, Integer> length = name-> name.length();
	   Function<Integer, Integer> DoubleLength = size->size*2;
	   
	   
	   
	   names.stream()
	        .map(length.andThen(DoubleLength))
	        .forEach(System.out::println);
		
	   names.stream()
		    .map(DoubleLength.compose(length))
		    .forEach(System.out::println);
		
	}
	
}
