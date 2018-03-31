import java.util.*;

public class TerminalSample{
 
 public static void main(String[] args){
  
  List<Integer> numbers = Arrays.asList(1,2,3,4,5);
  
  System.out.println(numbers.stream()
   .filter(e->e%2==0)
    .count());
  
 }
 
 
 
 
}