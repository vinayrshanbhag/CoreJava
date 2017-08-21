package com.learning.lamba;

import java.util.Arrays;
import java.util.List;

public class Sample {
	
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
	 /*	numbers.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer value) {
				System.out.println(value);		
	    }
     });*/
		
		//numbers.forEach((Integer value) -> System.out.println(value));
		
	   //  numbers.forEach(value-> System.out.println(value));
		
	  numbers.forEach(System.out::println);
		
	}
}
