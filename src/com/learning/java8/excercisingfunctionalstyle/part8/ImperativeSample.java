package com.learning.excercisingfunctionalstyle.part8;

import java.util.*;

public class ImperativeSample {
	
	
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
		//Group the people of the same age;
		
		Map<Integer,List<Person>> groupedByAge = new HashMap<>();
		
		for(Person person:people){
			int age = person.getAge();
			
			
			if(!groupedByAge.containsKey(age)){
				groupedByAge.put(age, new ArrayList<>());
			}			
			
			groupedByAge.get(age).add(person);
			
		}
		
		System.out.println(groupedByAge);
		
		
		
		
	}

}
