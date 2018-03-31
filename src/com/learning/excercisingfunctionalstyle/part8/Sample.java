package com.learning.excercisingfunctionalstyle.part8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Sample {
	public static void main(String[] args) throws IOException {
		final String SEARCH_WORD = ";";
		final String PATH = "/Users/vinayshanbhag/git/CoreJava/src/com/learning/ConsumerInterface/ConsumerSample.java";
	
		
		System.out.println(imperativeWordSearch(SEARCH_WORD,PATH));
		System.out.print(functionalWordSearch(SEARCH_WORD,PATH));
	
	
	
	}

	private static long functionalWordSearch(String searchWord, String path) throws IOException {
		 return  Files.lines(Paths.get(path))
				      .flatMap(line->Stream.of(line.split(" ")))
		              .filter(line-> line.contains(searchWord))
		              .count()	;
	}

	private static int imperativeWordSearch(String searchWord, String path) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path)));
		String line = null;
		int count=0;
		while((line=bufferedReader.readLine())!=null) {
			String[] words = line.split(" ");
			for(String word:words) {
				if(word.contains(searchWord)) {
					count++;
				}
			}
			
		}
		
		return count;
		
		
	}
}
