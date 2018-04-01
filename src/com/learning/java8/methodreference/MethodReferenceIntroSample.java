package com.learning.java8.methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceIntroSample {
	
	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(1,2,3);
		
		//numbers.forEach(number->System.out.print(number));
		
		numbers.forEach(System.out::println);
	}

}
