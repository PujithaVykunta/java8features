package java8Features;

public class Main {
	public static void main(String[] args) {
		
	
	Runnable rt=()->{
		System.out.println("thread3");
		new Thread().start();
	};
	
	rt.run();
	
	Runnable rt1=()->{
		System.out.println("thread4");
		new Thread().start();
	};
	rt1.run();
	Thread abc=new Thread(()->System.out.println("thread 5"));
	abc.start();
	
	new Thread(() -> System.out.println("thread 1")).start();
	new Thread(() -> System.out.println("thread 2")).start();
	
	}
}
