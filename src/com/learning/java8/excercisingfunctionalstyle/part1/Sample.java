package com.learning.java8.excercisingfunctionalstyle.part1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Sample {

	 public static void main(String[] args) {
		 
		 ExecutorService executorService = Executors.newFixedThreadPool(10);
		 
		IntStream.range(1, 10)
		         .forEach(i->executorService.submit(()->
		                  System.out.println("Running task "+ i)));
		 
		/* for(int i=0;i<10;i++){
			 //final int index =i;
			 //effectivly final
			 int index =i;
			 executorService.submit(()->System.out.println("Running task "+ index));
		 }*/
		 
		 System.out.println("Task started...");
	     executorService.shutdown();
		 
		  
	}
	
	
}
