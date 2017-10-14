package com.learning.java8.FunctionalInterface;

public class RunnableFunctionalSample {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
			System.out.println("Hello from"+ Thread.currentThread());
				
			}
		});*/
		
		Thread th = new Thread(() -> System.out.println(Thread.currentThread()));		
		th.start();
		th.join();
		
		
		Runnable runnable = () -> System.out.println("Hello from "+ Thread.currentThread());
		runnable.run();
		
		Thread thread = new Thread(runnable);
		thread.start();
		thread.join();
	}
	
	
 
}
