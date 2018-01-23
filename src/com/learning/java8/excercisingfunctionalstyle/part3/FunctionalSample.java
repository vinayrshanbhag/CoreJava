	package com.learning.java8.excercisingfunctionalstyle.part3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


class TimeSlot1{
	 
	 static Random random = new Random(System.nanoTime());
	 
	 public String schedule(){
		 return "booking details..." + hashCode();
	 }
	 
	 public boolean isAvailable(){
		 //return random.nextBoolean();
		 return true;
	 }
	 
	
}

public class FunctionalSample {
	
	public static List<TimeSlot1> createTimeSlots() {
		return Arrays.asList(new TimeSlot1(), 
				              new TimeSlot1(), 
				              new TimeSlot1(),
				              new TimeSlot1(), 
				              new TimeSlot1());
	}
	
	
	public static void main(String[] args) {
		List<TimeSlot1> timeSlots = FunctionalSample.createTimeSlots();
		
		System.out.println(timeSlots.stream()
				                    .filter(TimeSlot1::isAvailable)
				                    .findFirst()
				                    .map(TimeSlot1::schedule)
				                    .orElse("not available"));
		                            
		

	}

}
