package practice;

import java.util.function.Function;

class FunctionImple implements Function<String,Integer>{

	@Override
	public Integer apply(String s) {
		// TODO Auto-generated method stub
		return s.length();
	}

	
	
}
public class FunctionDemo {
public static void main(String[] args) {
	
//	Function<String,Integer> fun=new FunctionImple();
//	System.out.println(fun.apply("hello"));
	
	Function<String,Integer> fun= (String s)-> s.length();
	System.out.println(fun.apply("pujitha"));
}
}
