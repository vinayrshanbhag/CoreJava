package com.learning.excercisingfunctionalstyle.part3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


class TimeSlot1{
	 
	 static Random random = new Random(System.nanoTime());
	 
	 public String schedule(){
		 return "booking details..." + hashCode();
	 }
	 
	 public boolean isAvailable(){
		 return random.nextBoolean();
	 }
	 
	
}

public class FunctionalSample {
	
	
	public static void main(String[] args) {}{
		List<TimeSlot> timeSlots = ImpertativeSample.createTimeSlots();
		
		System.out.println(timeSlots.stream()
				                    .filter(TimeSlot::isAvailable)
				                    .findFirst()
				                    .map(TimeSlot::schedule)
				                    .orElse("not available"));
		                            
		

	}

}
