package com.learning.java8.excercisingfunctionalstyle.part7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FunctionalSample {

	
	public static void main(String[] args) throws IOException {
		
		String path = "/Users/vinayshanbhag/git/CoreJava/src/com/learning/ConsumerInterface/ConsumerSample.java";
		String searchWord = "forEach";
		
		
		
		long count = Files.lines(Paths.get(path))
		                  .filter(line-> line.contains(searchWord))
		                  .count();
		
		
		System.out.printf("The number of time the the word %s appeared is %d",searchWord, count);
	}
	
}
