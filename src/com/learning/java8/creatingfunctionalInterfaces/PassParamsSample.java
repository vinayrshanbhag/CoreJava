package com.learning.java8.creatingfunctionalInterfaces;

import java.util.Arrays;
import java.util.List;

public class PassParamsSample {
	
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3);
		
		//values.forEach(index-> TimeIt.code(()->ReturningSample.op1(index)));
		
		values.stream()
		     .map(index->TimeIt.code(index, value->ReturningSample.op1(value-1)))
		     .forEach(System.out::println);
	}

}
