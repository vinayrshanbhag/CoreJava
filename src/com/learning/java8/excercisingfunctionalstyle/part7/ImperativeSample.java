package com.learning.java8.excercisingfunctionalstyle.part7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ImperativeSample {
	
	
	public static void main(String[] args) throws IOException {
		String searchWord = "forEach";
		String path ="/Users/vinayshanbhag/git/CoreJava/src/com/learning/ConsumerInterface/ConsumerSample.java";
	
		
		long count =0;
		 BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		 
		 String line = null;
		 
		 while((line=bufferedReader.readLine())!=null) {
			 if(line.contains(searchWord)) {
				 count++; 
			 }
			 
		 }
		 
		 System.out.printf("The number of time the the word %s appeared is %d",searchWord, count);
		
		
	}

}
