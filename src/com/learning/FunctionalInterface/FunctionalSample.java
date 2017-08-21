package com.learning.FunctionalInterface;

public class FunctionalSample {

	public static void UseWorker(Worker worker){
		  worker.work();
	}
	
	
	public static void main(String[] args) {
		   
		/*UseWorker(new Worker() {			
			@Override
			public void work() {
				System.out.println("Working...");				
			}
		});*/
		
		UseWorker(()->System.out.print("Working.."));
		
	}
}
