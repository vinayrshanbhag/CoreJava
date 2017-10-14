package com.learning.java8.excercisingfunctionalstyle.part5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ImperativeSample {
     public static void main(String[] args) {
		List<Person> people = Arrays.asList(
          new Person("Vinay", 30),
          new Person("Shruthi",29),
          new Person("Vaidehi",2),
          new Person("Shrimanti", 55));
		
		
	 // Collections.sort(people);
		
//		Comparator<Person> comparator = new Comparator<Person>() {
//
//			@Override
//			public int compare(Person person1, Person person2) {
//				return ((Integer) person2.getAge()).compareTo(person1.getAge());
//			}
//		};
   
   Comparator<Person> comparatorLambda = (person1,person2)->((Integer) person2.getAge()).compareTo(person1.getAge());
		
	Collections.sort(people, comparatorLambda);	
	System.out.println(people);
		
	}
}
