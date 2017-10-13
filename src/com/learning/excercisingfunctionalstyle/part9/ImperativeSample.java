package com.learning.excercisingfunctionalstyle.part9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImperativeSample {
   public static void main(String[] args) {
	
	   List<String> names = Arrays.asList("Joe", "Raju", "Sam", "Jane","Sara");
	   List<Integer> scores = Arrays.asList(7,6,3,5,8);
	   
       List<List<Object>> results = new ArrayList<>();
	   
	   for(int i=0;i< names.size();i++){
		   results.add(Arrays.asList(names.get(i),scores.get(i)));
	   }
	   
}
}
