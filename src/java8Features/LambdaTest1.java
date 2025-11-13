package java8Features;

@FunctionalInterface
interface PaymentService{
	String makePayment(int amount);
}
interface Operation{
	int cal(int a,int b);
}

public class LambdaTest1 implements Runnable {
public static void main(String[] args) {
	PaymentService upi=(amount)->{
		
		return "making payment of: "+amount;
	};
	System.out.println(upi.makePayment(5000));
	System.out.println(upi.makePayment(200));
	
	Operation addition=(m,n)->(m+n);
	System.out.println("addition :"+addition.cal(10, 20));
	
	Operation mul=(m,n)->(m*n);
	Operation div=(m,n)->(m/n);
	Operation sub=(m,n)->(m-n);
	System.out.println("multiplication :"+mul.cal(10, 20));
	System.out.println("division :"+div.cal(10,20));
	System.out.println("subtraction :"+sub.cal(10,20));
}

@Override
public void run() {
	// TODO Auto-generated method stub
	
}
}
