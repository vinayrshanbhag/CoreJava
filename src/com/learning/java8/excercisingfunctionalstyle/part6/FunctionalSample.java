package com.learning.java8.excercisingfunctionalstyle.part6;

import java.util.stream.IntStream;

public class FunctionalSample {
	
	public static boolean isPrime(int number) {
		
		return number>1 && IntStream.range(1, number)
				                    .noneMatch(i->number%i==0);
	} 


	public static void main(String[] args) {
		
		IntStream.range(1, 8)
		         .forEach(i-> System.out.printf("isPrime(%d)? (%b)\n",i,isPrime(i)));
		
		
	}

}
