package practice;

public class Main {
public static void main(String[] args) {
	//using filed/property based DI
	Person p=new Person();
	p.coffee=new Coffee();
	p.startDay();
	//using constructor based dependency injection
	Mobile mobile=new Mobile(new Charger());
	mobile.playGame();
}
}
