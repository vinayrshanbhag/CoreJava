package com.learning.supplierfunctionalinterface;

import java.util.Arrays;
import java.util.List;

public class SupplierOptionalSample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jack", "Jill");
		
		System.out.println(names.stream()
			     .filter(name->name.length()==3)
			     .findFirst()
			     .orElseGet(()->"None"));

	}

}
