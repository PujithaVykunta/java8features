package com.practice;

import java.util.Arrays;

public class Reg {
public static void main(String[] args) {
	String s="I am learning Stream Api in java";
	
	Arrays.stream(s.split(" "))
	.filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==2)
	.forEach(System.out::println);
}
}
