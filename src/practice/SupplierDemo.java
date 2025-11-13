package practice;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierImple implements Supplier<LocalDateTime>{

	@Override
	public LocalDateTime get() {
		// TODO Auto-generated method stub
		return LocalDateTime.now()  ;
	}
	
}
public class SupplierDemo {

public static void main(String[] args) {
//	Supplier<LocalDateTime> sup=new SupplierImple();
//	System.out.println(sup.get());
	Supplier<LocalDateTime> sup=()->LocalDateTime.now();
	System.out.println(sup.get());
	
	
}
}
