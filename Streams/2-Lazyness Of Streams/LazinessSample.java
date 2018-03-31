import java.util.*;

public class LazinessSample{
 
 public static int computeImperative(List<Integer> numbers){
  int result = 0;
  
  for(int num: numbers){
   if( num>3 && num%2==0){
       result = num*2;
       break;
   }
  }
  return result;
 }
 
 public static int computeFunctional(List<Integer> numbers){
  
  return numbers.stream()
                .filter(LazinessSample::isGt3)
                .filter(LazinessSample::isEven)
                .map(LazinessSample::doubleIt)
                .findFirst()
                .orElse(0);
 }
 
 public static boolean isGt3(int number){
  System.out.println("isGt3 called for"+ number);
  return number>3;
 }
 
 public static boolean isEven(int number){
  System.out.println(" Double it called for"+ number);
  return number%2==0;
 }
 
 public static int doubleIt(int number){
  System.out.println("isGt3 called for"+ number);
  return number*2;
 }
 
 public static void main(String[] args){
  
  List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
  
  // Find the double of the first number greater than 3 and even number
  
  System.out.println(computeFunctional(numbers));
  System.out.println(computeImperative(numbers)); 
  
  
  
    
  
 }
}