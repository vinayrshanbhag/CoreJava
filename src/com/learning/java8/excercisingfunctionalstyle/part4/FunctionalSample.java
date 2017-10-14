package com.learning.excercisingfunctionalstyle.part4;

import java.io.File;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalSample {
   public static void main(String[] args) {
	   File directory = new File("/Users/vinayshanbhag/IdeaProjects/CoreJava");
		File[] children = directory.listFiles();
		
		System.out.println(Stream.of(children)
			                     .map(File::getName)
			                     .map(String::toUpperCase)
			                     .collect(Collectors.joining(",")));;
		
	   
	   
	   
	   
	   
}
}
