package com.learning.creatingfunctionalInterfaces;

public class TimeIt {
	

	
	public static void code(Runnable codeBlock) {
		long start = System.nanoTime();
		try {
			codeBlock.run();
		}
		
		finally {
			long end =System.nanoTime();
			System.out.println("Time Taken(s) " +(end-start)/1.0e9);
		}
		
		
	}
	
	public static int code(Runnable codeBlock) {
		long start = System.nanoTime();
		try {
			codeBlock.run();
		}
		
		finally {
			long end =System.nanoTime();
			System.out.println("Time Taken(s) " +(end-start)/1.0e9);
		}
		
		
	}

}
