import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;


public class DesigningWithStreams{

 public static final  int MAX = 1000;

public static List<Integer> createValues(){
 
 List<Integer> values = IntStream.range(0, MAX)
                                 .boxed()                                                                                     
                                 .collect(toList());
                                 
  return values;
}

public static Stream<Integer> getEven(Stream<Integer> values){
 
  return values.filter(e->{
   System.out.println("check even");
   return e%2==0;
   }
   );
               
 
}

public static Stream<Integer> getDoubledValues(Stream<Integer> evenOnlyValues){
 
 return evenOnlyValues.map(e->
   {
     System.out.println("doubling it..");
     return e*2;
 });
                   
 
}

public static long getTotal(Stream<Integer> values){
 return values.reduce(0, (c,e)-> c+e);
}
//
public static long getProduct(Stream<Integer> values){
 return values.reduce(1, (c,e)->c*e);

}

public static Stream<Integer> doOp(List<Integer> values){
 Stream<Integer> evenOnly = getEven(values.stream());

 Stream<Integer> doubledValues = getDoubledValues(evenOnly);
 
 return doubledValues;
}



public static void main(String[] args){
 
 List<Integer> values = createValues();
 System.out.println(values.size());
 //System.out.println(values);
 
 
 TimeIt.code(()->{
  
  Stream<Integer> partialResult1 = doOp(values);

  //System.out.println(evenOnly.size());
  // System.out.println(doubledValues);
  System.out.println("Finished do op");

  //long totaledValues = getTotal(partialResult1);
//
  //System.out.println(totaledValues);
//
//
  Stream<Integer> partialResult2 = doOp(values);
  long product = getProduct(partialResult2);

  System.out.println(product);
 });
 
 
 
}

}