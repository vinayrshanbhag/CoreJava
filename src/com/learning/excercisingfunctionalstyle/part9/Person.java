package com.learning.excercisingfunctionalstyle.part9;

public class Person {

	private int age;
	private String name;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	public int getAge() {
         return this.age;
	}

}
