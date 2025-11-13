package practice;

import java.util.function.Function;

public class MethodRefDemo {
public static void main(String[] args) {
	//lambda exp
	Function<Integer,Double>fun=(a)->Math.sqrt(a);
	System.out.println(fun.apply(25));
		
	//using method reference
	Function<Integer,Double>fun1=Math::sqrt;
	System.out.println(fun1.apply(64));
	
}
}
