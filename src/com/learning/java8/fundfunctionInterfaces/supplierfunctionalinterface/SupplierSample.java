package com.learning.java8.fundfunctionInterfaces.supplierfunctionalinterface;

import java.util.function.Supplier;

public class SupplierSample {
	
	static class MyClass{
		public MyClass(){
			System.out.println("Creating myClass...");
		}
	}
	
	
	
	/*public static void use(Supplier<Integer> factory){
		System.out.println("Using "+ factory.get());
	}*/
	
	public static void use(Supplier<MyClass> factory, int value){
		if(value>5){
			MyClass inst = factory.get();
			System.out.println(inst);
		}
		
	}
	
	public static void main(String[] args) {
		
		Supplier<Integer> factory = () -> 2;		
		System.out.println(factory.get());
		
		/*use(()->2);
		use(()->3);*/
		use(()->new MyClass(), 4);
		use(()->new MyClass(),6);
		
		
		
	}

}
