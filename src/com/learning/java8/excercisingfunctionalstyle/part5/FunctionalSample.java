package com.learning.excercisingfunctionalstyle.part5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.comparing;

public class FunctionalSample {
	
//	public static Comparator<Person>  comparing(Function<Person, String> by){
//		return (person1,person2) -> by.apply(person1).compareTo(by.apply(person2));
//	}
	
       public static void main(String[] args) {
    	   
    	   List<Person> people = Arrays.asList(
    		          new Person("Vinay", 30),
    		          new Person("Shruthi",29),
    		          new Person("Vaidehi",2),
    		          new Person("Shrimanti", 55));
    	   
    	   Comparator<Person> comparbyAge = (person1,person2)->((Integer) person1.getAge()).compareTo(person2.getAge());
    	   
    	   
    	   
//    	   Function<Person, String> byName = person->person.getName();
    	 //  Function<Person, String> byName = Person::getName;
    	   
    	  // Comparator<Person> compareByName = (person1,person2)-> byName.apply(person1).compareTo(byName.apply(person2));   
    	   
    	   Comparator<Person>  compareByName = comparing(Person::getName);
    	   
    	   System.out.println(people);
    	   System.out.println(sortBy(people, comparbyAge));
    	   //System.out.println(sortBy(people,compareByName));
    	   System.out.println(sortBy(people,comparing(Person::getName)));
    	   System.out.println(sortBy(people,comparing(Person::getAge)));
      	                        
		 
	}
       
       
       public static List<Person> sortBy(List<Person> people, Comparator<Person> comparator){
    	        return people.stream()
    	        		         .sorted(comparator)
    	        		         .collect(toList());
    	   
    	   
       }
}
