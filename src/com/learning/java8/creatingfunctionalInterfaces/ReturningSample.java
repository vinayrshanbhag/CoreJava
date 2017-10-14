package com.learning.creatingfunctionalInterfaces;

public class ReturningSample {

   public static void main(String[] args) throws InterruptedException {
	   
	   Thread.sleep(1000);	   
	   int result = TimeIt.code(()->op1(2));
	   
	   double result2 = TimeIt.code(()-> op1(4)*2.0);
	   System.out.println(result);
	   System.out.println(result2);
	
    }

	public static int op1(int value) {
		return value * 2;
	}
	
	
	
}
