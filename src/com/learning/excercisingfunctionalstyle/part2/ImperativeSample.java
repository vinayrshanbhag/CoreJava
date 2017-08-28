 package com.learning.excercisingfunctionalstyle.part2;

import java.util.ArrayList;
import java.util.List;

public class ImperativeSample {
	
	public static void main(String[] args) {
		List<Double> sqrtOfFirst100Evens  = new ArrayList<>();
		
		int index =1;
		
		while(sqrtOfFirst100Evens.size()<100){
			if(isEven(index)){
				sqrtOfFirst100Evens.add(Math.sqrt(index));
			}
		}
		
		
		
	}

	public static boolean isEven(int number) {
		return number%2==0;
	}

}
