package com.learning.creatingfunctionalInterfaces;

public class ReturningSample {

   public static void main(String[] args) throws InterruptedException {
	   
	   Thread.sleep(1000);	   
	   TimeIt.code(()->System.out.println(op1(2)));
	
    }

	public static int op1(int value) {
		return value * 2;
	}
}
