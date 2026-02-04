package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamss {
public static void main(String[] args) {
	 List< Integer> l1= new ArrayList<Integer>();
	 l1.addAll(Arrays.asList(2,6,8,5,3,7));
	 System.out.println(l1);
	 
	 Stream<Integer> stream=l1.stream();
	 stream.sorted()
	 .forEach(System.out::println);
	 
	 
}
}
