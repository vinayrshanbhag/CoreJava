package com.learning.java8.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.function.Function;

public class CallableFunctionalSample {
	
	
	public static Callable<Integer> doubleIt(int index){
		return () ->{
			try{Thread.sleep(1000);}
			catch(Exception e){	e.printStackTrace();}
			return index*2;
		};		
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService pool = Executors.newFixedThreadPool(10);
		
		/*List<Future<Integer>> results =new ArrayList<>();*/
		
		/*for(int i=0;i<3;i++){
			final int index = i;
			results.add(pool.submit(new Callable<Integer>() {				
				public Integer call() throws Exception {					
					try{
						Thread.sleep(1000);
					}
					catch(Exception e){
						e.printStackTrace();
					}
					return index*2;
				}
			}));
		}*/ 
		List<Integer> indices = Arrays.asList(0,1,2);
		
		Function<Integer, Future<Integer>> task = (Integer index) ->pool.submit(CallableFunctionalSample.doubleIt(index));
		
		
		List<Future<Integer>> results = indices.stream().
		                                        map(task).
		                                        collect(Collectors.toList());
	/*	
		indices.forEach(index-> {
			results.add(pool.submit(()->{					
				try{
					Thread.sleep(1000);
				}
				catch(Exception e){
					e.printStackTrace();
				}
				return index*2;
			}));
		});*/
		
		/*for(int i=0;i<3;i++){
			final int index = i;
			results.add(pool.submit(()->{					
					try{
						Thread.sleep(1000);
					}
					catch(Exception e){
						e.printStackTrace();
					}
					return index*2;
				}));
			
		}*/
		
		
		for(Future<Integer> result:results){
			System.out.println(result.get());
		}
		
		pool.shutdown();
		
		
	}

}
