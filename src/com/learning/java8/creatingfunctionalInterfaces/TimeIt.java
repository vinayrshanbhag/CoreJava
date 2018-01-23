package com.learning.java8.creatingfunctionalInterfaces;

import java.util.function.Function;
import java.util.function.Supplier;

public class TimeIt {
	
	
	public interface Factory{
		int produce();  
	}

	
	public static void code(Runnable codeBlock) {
		/*long start = System.nanoTime();
		try {
			codeBlock.run();
		}  
		
		finally {
			long end =System.nanoTime();
			System.out.println("Time Taken(s) " +(end-start)/1.0e9);
		}
		*/
		
		
	//	code(()-> {codeBlock.run();return null; });
		
	   code(null, unused-> {codeBlock.run();return null;});
		
	}
	
	
	
	
	public static <T> T code(Supplier<T> codeBlock) {/*
		long start = System.nanoTime(); 
 		try {
			return codeBlock.get();
		}
		
		finally {
			long end =System.nanoTime();
			System.out.println("Time Taken(s) " +(end-start)/1.0e9);
		}
		
	*/
	 return code(null, unused->codeBlock.get())	;
	}
	
	public static <T,R> R code(T input, Function<T,R> codeBlock) {
		long start = System.nanoTime(); 
 		try {
			return codeBlock.apply(input);
		}
		
		finally {
			long end =System.nanoTime();
			System.out.println("Time Taken(s) " +(end-start)/1.0e9);
		}
		
	}

}
