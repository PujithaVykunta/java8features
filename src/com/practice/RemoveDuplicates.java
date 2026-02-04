package com.practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
public static void main(String[] args) {
	String a="aabceefgss";
	String result=
			Arrays.stream(a.split(""))
			.distinct()
			.collect(Collectors.joining())
			;
	System.out.println(result);
	//without using streams
	StringBuilder sc=new StringBuilder();
	Set<Character>set=new LinkedHashSet<Character>();
	for (Character ch : a.toCharArray()) {
		set.add(ch);
	}
	for (Character ch : set) {
		sc.append(ch);
	}
	System.out.println(sc);
}
}
