package com.practice;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {
public static void main(String[] args) {
	String name="i am learning streams";
	String output= 
			Arrays.stream(name.split(" "))
			.max(Comparator.comparing(String::length))
			.get();
	System.out.println(output);
	
	String result=
			Arrays.stream(name.split(" "))
			.min(Comparator.comparing(String::length))
			.get();
	System.out.println(result);
	
	//second largest or 3rd,4rth
	String second=Arrays.stream(name.split(" "))
	.sorted(Comparator.comparing(String::length).reversed())
	.skip(1).
	findFirst()
	.get();
	System.out.println(second);
	
	int a=Arrays.stream(name.split(" "))
	.map(x->x.length())
	.sorted(Comparator.reverseOrder())
	.skip(1)
	.findFirst()
	.get();
	System.out.println(a);
}
}
