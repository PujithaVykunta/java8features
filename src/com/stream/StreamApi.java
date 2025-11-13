package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {
	public static void main(String[] args) {
	List<Integer> list1=Arrays.asList(1,2,4,19,34,12,3,8);
	
	Stream<Integer> stream=list1.stream();
	
	stream.forEach(System.out::println);
	
	System.out.println("even numbers are");
	for(Integer i:list1) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
	System.out.println("using stream filter() method ");
	
	list1.stream()
	.filter(i->(i%2==0))
	.forEach(System.out::println);
	System.out.println("copying from stream to list");
	List<Integer> evennumbers=list1.stream()
			.filter(i->(i%2==0))
			.toList();
	evennumbers.forEach(System.out::println);
	
	//predicate is inbuilt functional interface have  boolean test() method giving implementation in a filter() method
	Predicate<Integer> check=i->(i%2==0);
	System.out.println(check.test(7));

	//Consumer is a functional interface  have void accept(it takes type as argument) method
	Consumer<String> consume=message->System.out.println("hi "+message);
	
	consume.accept("pooji");
	
	
	//stream will  only once it is operated we cannot operate many  times
//	stream.forEach(n->System.out.println(n));	
	
	
	}
}
