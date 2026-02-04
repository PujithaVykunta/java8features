package practice;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodRefDemo {
public static void main(String[] args) {
	///1.method reference to a static method
	//lambda expression
	Function<Integer,Double>fun=(a)->Math.sqrt(a);
	System.out.println(fun.apply(25));
		
	//using method reference
	Function<Integer,Double> fun1=Math::sqrt;
	System.out.println(fun1.apply(64));
	
	///using lambda
	BiFunction<Integer,Integer,Integer> bifun=(a,b)->MethodRefDemo.add(a,b);
	System.out.println(bifun.apply(10,20));
	
	///method reference
	BiFunction<Integer,Integer,Integer> bifun1=	MethodRefDemo::add;
	System.out.println(bifun1.apply(10,20));
	
}
public static int add(int a,int b) {
	return a+b;
}
}
