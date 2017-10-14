package com.learning.java8.fundfunctionInterfaces.predicateInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSample {
	
	public static void main(String[] args) {
		
		Predicate<Integer> eval = value -> value>2;		
		System.out.println(eval.test(3));
		System.out.println(eval.test(1));
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		System.out.println(total(values, (value)->value>3));
		
		List<String> names = Arrays.asList("Jack","Joe","Vaidehi", "Por");
		 
		Predicate<String> startsWithJ = name -> name.startsWith("J");
		Predicate<String> length4 = name -> name.length()==4 ;
		
		
	    names.stream()
	         .filter(startsWithJ.and(length4))
	         .forEach(System.out::print);
	    
	    names.stream()
		     .filter(startsWithJ.negate())
		     .forEach(System.out::print);
				                
				               
				
		
		
		 
		
		 
	}

	private static  Integer total(List<Integer> values, Predicate<Integer> eval) {
		return values.stream()
				    .filter(eval)
				    .mapToInt(value-> value)
				    .sum();
				    
	

}
	
}
