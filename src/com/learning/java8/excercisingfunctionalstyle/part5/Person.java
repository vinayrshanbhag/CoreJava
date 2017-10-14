package com.learning.excercisingfunctionalstyle.part5;

public class Person{ //implements Comparable<Person>{
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.age = age;
		this.name= name;
	}

//	@Override
//	public int compareTo(Person otherPerson) {
//		return ((Integer)(age)).compareTo(otherPerson.age);
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
