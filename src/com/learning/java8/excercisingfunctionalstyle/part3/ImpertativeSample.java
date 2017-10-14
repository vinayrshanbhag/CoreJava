package com.learning.java8.excercisingfunctionalstyle.part3;

import java.sql.Time;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class TimeSlot{
	 
	 static Random random = new Random(System.nanoTime());
	 
	 public String schedule(){
		 return "booking details..." + hashCode();
	 }
	 
	 public boolean isAvailable(){
		 return random.nextBoolean();
	 }
	 
	
}



public class ImpertativeSample {
	
	public static List<TimeSlot> createTimeSlots(){
		return Arrays.asList(new TimeSlot(),new TimeSlot(),new TimeSlot() ,new TimeSlot(), new TimeSlot());
	}
	
	public static void main(String[] args) {
		List<TimeSlot> timeSlots= createTimeSlots();
		
		String bookingDetails = null;
		
		
		for(TimeSlot timeSlot:timeSlots){
			if(timeSlot.isAvailable()){
				bookingDetails= timeSlot.schedule();
				break;
			}
		}
		
		if(bookingDetails!=null){
			System.out.println(bookingDetails);
		}
		else{
			System.out.println("Booking not available");
		}
	}
	

}
