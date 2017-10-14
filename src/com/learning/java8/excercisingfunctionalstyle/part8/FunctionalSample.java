package com.learning.java8.excercisingfunctionalstyle.part8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class FunctionalSample {
public static List<Person> createPeople(){
		
		return Arrays.asList(
                new Person("Sara", 20),   
                new Person("Sara", 22),  
                new Person("Bob", 20),  
                new Person("Paula", 32),  
                new Person("Paul", 32),  
                new Person("Jack", 2),  
                new Person("Jack", 72),
                new Person("Jill",12));
		
	}
	
	
	
	public static void main(String[] args) {
		List<Person> people = createPeople();
		
		System.out.println(people.stream()
                .collect(groupingBy(p->p.getAge())));
		
		System.out.println(people.stream()
				                 .collect(groupingBy(p->p.getAge(),mapping(Person::getName,toList()))));
		
		
		
		
	
	}

}
