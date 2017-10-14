package com.learning.excercisingfunctionalstyle.part9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.AbstractMap.SimpleEntry;


class Tuple<Left,Right>{
	
	public final Left left;
	
	public final Right right;
	
	public Tuple(Left theLeft, Right theRight){
		left = theLeft;
		right = theRight;
	}
	
	public String toString(){
		return left + " "+ right;
	}
	
}

public class ImperativeSample {
	
	/*public List<Object> tuple(String name, int i){
		return Arrays.asList(name, i);
	}*/
	
	/*public static Tuple<String, Integer> tuple(String name, int score){
		return new Tuple<String,Integer>(name, score);
	}*/
	
	public static SimpleEntry<String, Integer> simpleEntry(String name,int score){
		return new SimpleEntry<String, Integer>(name, score);
	}
	
	
	
   public static void main(String[] args) {
	
	   List<String> names = Arrays.asList("Joe", "Raju", "Sam", "Jane","Sara");
	   List<Integer> scores = Arrays.asList(7,6,3,5,8);
	   
//       List<List<Object>> results = new ArrayList<>();
	   
//	   List<Tuple<String,Integer>> results = new ArrayList<>();
	   
	   List<SimpleEntry<String, Integer>> results = new ArrayList<>();
	   
	  /* for(int i=0;i< names.size();i++){
		  // results.add(tuple(names.get(i),scores.get(i)));
		   results.add(simpleEntry(names.get(i),scores.get(i)));
	   }*/
	   
	   System.out.println(IntStream.range(0,Math.min(names.size(),scores.size()))
	                               .mapToObj(i->simpleEntry(names.get(i), scores.get(i)))
	                               .collect(Collectors.toList()));; 
	   
	  // System.out.println(results);
	   
}
}
