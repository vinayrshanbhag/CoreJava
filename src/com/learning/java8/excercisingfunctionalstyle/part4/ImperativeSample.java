package com.learning.java8.excercisingfunctionalstyle.part4;

import java.util.*;
import java.io.*;



public class ImperativeSample {

	public static void main(String[] args) {
		File directory = new File("/Users/vinayshanbhag/IdeaProjects/CoreJava");
		File[] children = directory.listFiles();

		if (children != null) {
			for (File child : children) {
				System.out.println(child.getName().toUpperCase()+ ",");
			} 
			System.out.println("");
		}
	}

}


