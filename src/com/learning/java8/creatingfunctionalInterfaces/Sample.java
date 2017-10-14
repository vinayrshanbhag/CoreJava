package com.learning.java8.creatingfunctionalInterfaces;

public class Sample {
	
	
	public static void useless(int value) {
		
		if(value==0) {
			throw new RuntimeException("I dont like zero");
		}
		try {
			Thread.sleep(1000);
		}
		catch(Exception ex) {
			
		}
		
		System.out.println("Useless called with value" + value);
	}
	
	public static void main(String[] args) {
		
//		TimeIt.code(new TimeIt.Block() {
//			
//			@Override
//			public void run() {
//				useless(1);
//				
//			}
//		});
		
		TimeIt.code(()->useless(1));
		TimeIt.code(()->useless(2));
		try {
			TimeIt.code(()->useless(0));
		}
		catch(RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}
	
	

}
