package com.learning.java8.fundfunctionInterfaces.ConsumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
	
	public static void main(String[] args) {
		
		Consumer<Integer> printIt = (value) -> System.out.println(value);	
		
		Consumer<Integer> print1 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
			System.out.println(t);
				
			}
		};
		printIt.accept(5);
		
		
		
		
		List<Integer> listOfNumbers = Arrays.asList(1,2,3);
		
		listOfNumbers.forEach(value-> System.out.println(value));
		listOfNumbers.forEach(printIt);
		listOfNumbers.forEach(print1);
	
		
		
		
	}

}
