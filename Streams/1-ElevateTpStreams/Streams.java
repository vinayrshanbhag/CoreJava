import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class Streams{
	
	
	public static void main(String[] args){
		
		//when there is list
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		numbers.stream()
			   .map(e->e*2)
			   .filter(e->e%2==0)
			   .forEach(System.out::println);
			
		//When there is an array
		File currentDirectory = new File(".");
		File[] children = currentDirectory.listFiles();
		
		Stream.of(children)
		//Arrays.stream(children)
			  .map(file-> file.getName())
			  .forEach(System.out::println);
     
     // If there is varargs, Arrays.stream doesnt work. 
     // If there is a collection, either of it can be used.
     //Arrays.stream("etc",".")
     Stream.of("/etc", ".")
      .map(name-> new File(name))
       .map(file-> file.getName())
        .forEach(System.out::println);
		
	}
}