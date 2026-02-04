package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NumOfOcc {
public static void main(String[] args) {
	String s="I am learning streams in java java java java";
	
	//count of occurrences in a string
	Map<String,Long>map=Arrays.stream(s.split(" "))
	.collect(Collectors.groupingBy(x->x, Collectors.counting()));
	System.out.println(map);
	
	//find the most frequent word
	Map.Entry<String,Long>map1=
			Collections.max(map.entrySet(),Map.Entry.comparingByValue());
	System.out.println(map1);
	
	//without using streams
	String[]words=s.split(" ");
	Map<String,Long>map3=new HashMap<String, Long>();
	for (String word : words) {
		map3.put(word, map3.getOrDefault(word, (long) 0)+1);
		
	}
	System.out.println(map3);
	
	String mostFrequent=null;
	Long maxcount=(long) 0;
	for(Map.Entry<String,Long>entry:map3.entrySet()) 
	{
		if(entry.getValue()>maxcount) {
			mostFrequent=entry.getKey();
			maxcount=entry.getValue();
		}
		
	}
			System.out.println("mostfrequent:"+mostFrequent+" "+"count:"+maxcount);
}
}
