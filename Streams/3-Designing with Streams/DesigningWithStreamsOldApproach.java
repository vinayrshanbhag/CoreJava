import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;


public class DesigningWithStreamsOldApproach{

 public static final  int MAX = 10000;

public static List<Integer> createValues(){
 
 List<Integer> values = IntStream.range(0, MAX)
                                 .boxed() 
                                 .collect(toList());                                                        
                                 
  return values;
}

public static List<Integer> getEven(List<Integer> values){
 
  return values.stream()
               .filter(e->e%2==0)
               .collect(toList());
 
}

public static List<Integer> getDoubledValues(List<Integer> evenOnlyValues){
 
 return evenOnlyValues.stream()
  .map(e->e*2)
   .collect(toList());
 
}

public static long getTotal(List<Integer> values){
 return values.stream()
              .reduce(0, (c,e)-> c+e); 
}

public static long getProduct(List<Integer> values){
 return values.stream()
  .reduce(1, (c,e)->c*e);
 
}

public static void main(String[] args){
 
 List<Integer> values = createValues();
 System.out.println(values.size());
 //System.out.println(values);
 
 TimeIt.code(()->{
  List<Integer> evenOnly = getEven(values);
 
  List<Integer> doubledValues = getDoubledValues(evenOnly);
 
  System.out.println(evenOnly.size());
  // System.out.println(doubledValues);
 
  Long totaledValues = getTotal(doubledValues);
 
  System.out.println(totaledValues);
 
 
  long product = getProduct(doubledValues);
  System.out.println(product);
 });
 
 
 
}

}