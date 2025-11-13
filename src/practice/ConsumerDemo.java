package practice;

import java.util.function.Consumer;

class ConsumerImple implements Consumer<String >{

	@Override
	public void accept(String input) {
		System.out.println(input);
		
	}
	
}
public class ConsumerDemo {
public static void main(String[] args) {
//	Consumer<String> con=new ConsumerImple();
//	con.accept("poojitha");
	Consumer<String> con=(String input)->System.out.println(input);
		con.accept("poojitha");
	
}
}
