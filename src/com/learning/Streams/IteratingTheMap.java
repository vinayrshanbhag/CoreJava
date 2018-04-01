package com.learning.Streams;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vinayshanbhag on 3/25/18.
 */
public class IteratingTheMap {

    private static Map<String, Integer> scores = new HashMap<>();

    private static void printTheMap(String name, Integer scores){
        System.out.println(name + "---"+ scores);
    }

    public static void main(String[] args) {
        scores.put("Tom",1);
        scores.put("Jerry",2);
        scores.put("Spike",3);
        scores.put("Tyke",4);
        System.out.println("Working fine");

        scores.forEach(IteratingTheMap::printTheMap);


    }
}
